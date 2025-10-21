package academy.tochkavhoda.introduction;

public class ZeroSteps3 {

    public int sum(int[] array) {
        if (array.length == 0) return 0;
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int mul(int[] array) {
        if (array.length == 0) return 0;
        int product = 1;
        for (int value : array) {
            product *= value;
        }
        return product;
    }

    public int min(int[] array) {
        if (array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array) {
        if (array.length == 0) return 0.0;
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        for (int v : array) {
            if (v == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public void replaceBySquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                break;
            }
            array[i] = array[i] * array[i];
        }
    }

    public int mulNonZero(int[] array) {
        if (array.length == 0) return 0;
        int product = 1;
        boolean foundNonZero = false;
        for (int value : array) {
            if (value != 0) {
                product *= value;
                foundNonZero = true;
            }
        }
        return foundNonZero ? product : 0;
    }

    public boolean allPositive(int[] array) {
        if (array.length == 0) return false;
        for (int value : array) {
            if (value <= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean allEqual(int[] array) {
        if (array.length == 0) return true;
        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != first) {
                return false;
            }
        }
        return true;
    }

    public int greaterThanNeighbours(int[] array) {
        if (array.length < 3) return -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public boolean neighboursAverage(double[] array) {
        if (array.length < 3) return false;
        for (int i = 1; i < array.length - 1; i++) {
            double avg = (array[i - 1] + array[i + 1]) / 2.0;
            if (Math.abs(array[i] - avg) < 1e-9) {
                return true;
            }
        }
        return false;
    }

    public int sumBetween2Zeros(int[] array) {
        int firstZero = -1, secondZero = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (firstZero == -1) {
                    firstZero = i;
                } else {
                    secondZero = i;
                    break;
                }
            }
        }
        if (firstZero == -1 || secondZero == -1) {
            return 0; // по условию гарантируется ровно 2 нуля, но на всякий случай
        }
        int sum = 0;
        for (int i = firstZero + 1; i < secondZero; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int sameAtPosition(int[] array1, int[] array2) {
        int minLength = Math.min(array1.length, array2.length);
        int count = 0;
        for (int i = 0; i < minLength; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }
        return count;
    }

    public boolean bothZeroAtPosition(int[] array1, int[] array2) {
        int minLength = Math.min(array1.length, array2.length);
        for (int i = 0; i < minLength; i++) {
            if (array1[i] == 0 && array2[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public void accumulatedSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
        }
    }

    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            result[k++] = array1[i++];
        }
        while (j < array2.length) {
            result[k++] = array2[j++];
        }
        return result;
    }

    public int insideCircle(int[] x, int[] y, int radius) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            long distSquared = (long) x[i] * x[i] + (long) y[i] * y[i];
            if (distSquared <= (long) radius * radius) {
                count++;
            }
        }
        return count;
    }

    public double scalarProduct(double[] array1, double[] array2) {
        double sum = 0.0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[i];
        }
        return sum;
    }
}