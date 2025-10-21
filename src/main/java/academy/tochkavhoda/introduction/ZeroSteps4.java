package academy.tochkavhoda.introduction;

public class ZeroSteps4 {

    public int min(int[][] matrix) {
        if (matrix.length == 0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int[] row : matrix) {
            for (int value : row) {
                if (!found || value < min) {
                    min = value;
                    found = true;
                }
            }
        }
        return found ? min : Integer.MAX_VALUE;
    }

    public int max(int[][] matrix) {
        if (matrix.length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        boolean found = false;
        for (int[] row : matrix) {
            for (int value : row) {
                if (!found || value > max) {
                    max = value;
                    found = true;
                }
            }
        }
        return found ? max : Integer.MIN_VALUE;
    }

    public boolean find(int[][] matrix, int value) {
        for (int[] row : matrix) {
            for (int v : row) {
                if (v == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i = 0; i < row.length - 1; i++) {
                if (row[i] <= row[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hasNoZeroRows(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            boolean hasZero = false;
            for (int value : row) {
                if (value == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) {
                count++;
            }
        }
        return count;
    }

    public boolean hasFullZeroRow(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length == 0) continue;
            boolean allZero = true;
            for (int value : row) {
                if (value != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                return true;
            }
        }
        return false;
    }

    public boolean isSymmetric(int[][] matrix) {
        if (matrix.length == 0) return true;
        int n = matrix.length;
        // Проверяем, что матрица квадратная
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) return false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int mainDiagonalMax(int[][] matrix) {
        if (matrix.length == 0) return Integer.MIN_VALUE;
        int n = matrix.length;
        if (matrix[0].length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n && i < matrix[i].length; i++) {
            if (i == 0) {
                max = matrix[i][i];
            } else {
                if (matrix[i][i] > max) {
                    max = matrix[i][i];
                }
            }
        }
        return max == Integer.MIN_VALUE ? Integer.MIN_VALUE : max;
    }

    public int mainDiagonalPositivesSum(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < matrix.length && i < matrix[i].length; i++) {
            if (matrix[i][i] > 0) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }

    public int secondaryDiagonalMax(int[][] matrix) {
        if (matrix.length == 0) return Integer.MIN_VALUE;
        int n = matrix.length;
        if (matrix[0].length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n && i < matrix[i].length; i++) {
            int j = n - 1 - i;
            if (j < 0 || j >= matrix[i].length) continue;
            if (i == 0) {
                max = matrix[i][j];
            } else {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max == Integer.MIN_VALUE ? Integer.MIN_VALUE : max;
    }

    public int secondaryDiagonalPositivesSum(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n && i < matrix[i].length; i++) {
            int j = n - 1 - i;
            if (j >= 0 && j < matrix[i].length && matrix[i][j] > 0) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int[][] result = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int cols = matrix1[i].length;
            result[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void interchange(int[][] matrix) {
        for (int i = 0; i < matrix.length; i += 2) {
            if (i + 1 < matrix.length) {
                int[] temp = matrix[i];
                matrix[i] = matrix[i + 1];
                matrix[i + 1] = temp;
            }
        }
    }

    public int[] toLinearByRow(int[][] matrix) {
        int total = 0;
        for (int[] row : matrix) {
            total += row.length;
        }
        int[] result = new int[total];
        int index = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                result[index++] = value;
            }
        }
        return result;
    }

    public int[] toLinearByColumn(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int n = matrix.length;
        int m = matrix[0].length;
        int[] result = new int[n * m];
        int index = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                result[index++] = matrix[i][j];
            }
        }
        return result;
    }

    public int[] toLinearByRowUpperTriangle(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int n = matrix.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                result[index++] = matrix[i][j];
            }
        }
        return result;
    }

    public int sumUntilNotFoundInRow(int[][] matrix, int barrier) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == barrier) {
                    break;
                }
                sum += value;
            }
        }
        return sum;
    }

    public int sumUntilNotFound(int[][] matrix, int barrier) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == barrier) {
                    return sum;
                }
                sum += value;
            }
        }
        return sum;
    }
}