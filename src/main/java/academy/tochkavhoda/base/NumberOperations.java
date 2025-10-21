package academy.tochkavhoda.base;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class NumberOperations {
    // 1. Поиск элемента в массиве int[]
    public static Integer find(int[] array, int value) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return null;
    }

    // 2. Поиск элемента в массиве double[] с точностью eps
    public static Integer find(double[] array, double value, double eps) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - value) <= eps) {
                return i;
            }
        }
        return null;
    }

    // 3. Вычисление плотности вещества с проверкой диапазона
    public static Double calculateDensity(double weight, double volume, double min, double max) {
        if (volume == 0) {
            throw new IllegalArgumentException("Volume cannot be zero.");
        }
        double density = weight / volume;
        if (density >= min && density <= max) {
            return density;
        }
        return null;
    }

    // 4. Поиск элемента в массиве BigInteger[]
    public static Integer find(BigInteger[] array, BigInteger value) {
        if (array == null || value == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                return i;
            }
        }
        return null;
    }

    // 5. Вычисление плотности вещества с BigDecimal и проверкой диапазона
    public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
        // Проверка на null для входных параметров
        if (weight == null || volume == null || min == null || max == null) {
            throw new IllegalArgumentException("Input parameters cannot be null.");
        }

        // Проверка, что объем не равен нулю
        if (volume.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Volume cannot be zero.");
        }

        // Вычисление плотности с округлением до 10 знаков после запятой
        BigDecimal density = weight.divide(volume, 10, RoundingMode.HALF_UP);

        // Проверка, находится ли плотность в заданном диапазоне
        if (density.compareTo(min) >= 0 && density.compareTo(max) <= 0) {
            return density.stripTrailingZeros(); // Убираем лишние нули для чистоты результата
        }

        return null;
    }
}
