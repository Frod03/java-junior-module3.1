package academy.tochkavhoda.introduction;

public class ZeroSteps2 {

    public int sumSquares(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
        }
        return sum;
    }

    public int sumOdds(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public double sumInverses(int count) {
        double sum = 0.0;
        for (int i = 1; i <= count; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public long factorial(int count) {
        long result = 1;
        for (int i = 2; i <= count; i++) {
            result *= i;
        }
        return result;
    }

    public int prodDigits(int value) {
        if (value == 0) return 0;
        int product = 1;
        value = Math.abs(value);
        while (value > 0) {
            int digit = value % 10;
            product *= digit;
            value /= 10;
        }
        return product;
    }

    public int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        int prev = 0, curr = 1;
        for (int i = 2; i <= number; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public long sum2Powers(int max) {
        // Сумма геометрической прогрессии: 2^(max+1) - 1
        return (1L << (max + 1)) - 1;
    }

    public int sumSquaresWithBarrier(int count, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
            if (sum > barrier) {
                break;
            }
        }
        return sum;
    }

    public int sumPairProd(int count1, int count2) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    public int sumPairProdWithBarrier(int count1, int count2, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                int prod = i * j;
                if (prod < barrier) {
                    sum += prod;
                }
            }
        }
        return sum;
    }

    public double sumInversePairProd(int count1, int count2) {
        double sum = 0.0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += 1.0 / (i * j);
            }
        }
        return sum;
    }

    public int sumTripleProd(int count1, int count2, int count3) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                for (int k = 1; k <= count3; k++) {
                    sum += i * j * k;
                }
            }
        }
        return sum;
    }

    public double calculateE() {
        double sum = 1.0;
        double term = 1.0;
        int n = 1;
        while (term >= 1e-6) {
            term /= n;
            sum += term;
            n++;
        }
        return sum;
    }

    public double calculatePi() {
        double pi = 0.0;
        int sign = 1;
        int denominator = 1;
        double term;
        do {
            term = 1.0 / denominator;
            pi += sign * term;
            sign *= -1;
            denominator += 2;
        } while (term >= 1e-8);
        return pi * 4.0;
    }

    public double calculateCircleSquare(double length, int count) {
        double centerX = length / 2.0;
        double centerY = length / 2.0;
        double radius = length / 2.0;
        int inside = 0;

        for (int i = 0; i < count; i++) {
            double x = Math.random() * length;
            double y = Math.random() * length;
            double dx = x - centerX;
            double dy = y - centerY;
            if (dx * dx + dy * dy <= radius * radius) {
                inside++;
            }
        }

        return (length * length) * inside / (double) count;
    }
}