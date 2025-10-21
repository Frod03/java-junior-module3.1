package academy.tochkavhoda.introduction;

public class ZeroSteps1 {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public double calculateTriangleSquare(int side1, int side2) {
        return (side1 * side2) / 2.0;
    }

    public double calculateTrianglePerimeter(int side1, int side2) {
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        return side1 + side2 + hypotenuse;
    }

    public int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public long calculate15Degree(int number) {
        long n = number;
        long n2 = n * n;        // n^2
        long n4 = n2 * n2;      // n^4
        long n8 = n4 * n4;      // n^8
        long n15 = n8 * n4 * n2 * n; // n^(8+4+2+1) = n^15
        return n15;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public double sqrtAbs(int number) {
        return Math.sqrt(Math.abs(number));
    }

    public boolean isTriangleExist(int side1, int side2, int side3) {
        return side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }

    public int getDigitsProduction(int number) {
        int product = 1;
        for (int i = 0; i < 4; i++) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    public boolean isCircleInsideSquare(int radius, int side) {
        return 2 * radius < side;
    }

    public char getCharByCode(short code) {
        return (char) code;
    }

    public short getCodeByChar(char character) {
        return (short) character;
    }

    public char getCharByCodeAndOffset(char ch, short offset) {
        return (char) (ch + offset);
    }

    public boolean isGreaterOrEqual(char ch1, char ch2) {
        return ch1 >= ch2;
    }

    public char getAverageChar(char ch1, char ch2) {
        return (char) ((ch1 + ch2) / 2);
    }
}

