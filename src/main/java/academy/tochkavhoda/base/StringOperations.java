package academy.tochkavhoda.base;

import java.text.DecimalFormat;
import java.util.StringJoiner;

public class StringOperations {
    // 1. Возвращает суммарную длину строк
    public static int getSummaryLength(String[] strings) {
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return totalLength;
    }

    // 2. Возвращает двухсимвольную строку из первого и последнего символов
    public static String getFirstAndLastLetterString(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty.");
        }
        return string.substring(0, 1) + string.substring(string.length() - 1);
    }

    // 3. Проверяет, одинаковые ли символы в заданной позиции
    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        if (index < 0 || index >= string1.length() || index >= string2.length()) {
            return false;
        }
        return string1.charAt(index) == string2.charAt(index);
    }

    // 4. Проверяет, одинаковая ли первая позиция символа при просмотре от начала
    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        int pos1 = string1.indexOf(character);
        int pos2 = string2.indexOf(character);
        return pos1 != -1 && pos1 == pos2;
    }

    // 5. Проверяет, одинаковая ли первая позиция символа при просмотре от конца
    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        int pos1 = string1.lastIndexOf(character);
        int pos2 = string2.lastIndexOf(character);
        return pos1 != -1 && pos1 == pos2;
    }

    // 6. Проверяет, одинаковая ли первая позиция подстроки при просмотре от начала
    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        int pos1 = string1.indexOf(str);
        int pos2 = string2.indexOf(str);
        return pos1 != -1 && pos1 == pos2;
    }

    // 7. Проверяет, одинаковая ли первая позиция подстроки при просмотре от конца
    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        int pos1 = string1.lastIndexOf(str);
        int pos2 = string2.lastIndexOf(str);
        return pos1 != -1 && pos1 == pos2;
    }

    // 8. Проверяет, равны ли строки
    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    // 9. Проверяет, равны ли строки без учета регистра
    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    // 10. Проверяет, меньше ли первая строка второй
    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }

    // 11. Проверяет, меньше ли первая строка второй без учета регистра
    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) < 0;
    }

    // 12. Конкатенирует две строки
    public static String concat(String string1, String string2) {
        return string1.concat(string2);
    }

    // 13. Проверяет, начинаются ли строки с одной и той же подстроки
    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        return string1.startsWith(prefix) && string2.startsWith(prefix);
    }

    // 14. Проверяет, заканчиваются ли строки одной и той же подстрокой
    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.endsWith(suffix) && string2.endsWith(suffix);
    }

    // 15. Возвращает самое длинное общее начало строк
    public static String getCommonPrefix(String string1, String string2) {
        int minLength = Math.min(string1.length(), string2.length());
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                commonPrefix.append(string1.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }

    // 16. Переворачивает строку
    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    // 17. Проверяет, является ли строка палиндромом
    public static boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }

    // 18. Проверяет, является ли строка палиндромом без учета регистра
    public static boolean isPalindromeIgnoreCase(String string) {
        String lowerCase = string.toLowerCase();
        return lowerCase.equals(reverse(lowerCase));
    }

    // 19. Возвращает самый длинный палиндром из массива строк
    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        String longestPalindrome = "";
        for (String str : strings) {
            if (isPalindromeIgnoreCase(str) && str.length() > longestPalindrome.length()) {
                longestPalindrome = str;
            }
        }
        return longestPalindrome;
    }

    // 20. Проверяет, одинаковы ли фрагменты строк
    public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
        if (index + length > string1.length() || index + length > string2.length()) {
            return false;
        }
        return string1.substring(index, index + length).equals(string2.substring(index, index + length));
    }

    // 21. Проверяет равенство строк после замены символов
    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1,
                                                        String string2, char replaceInStr2, char replaceByInStr2) {
        String replaced1 = string1.replace(replaceInStr1, replaceByInStr1);
        String replaced2 = string2.replace(replaceInStr2, replaceByInStr2);
        return replaced1.equals(replaced2);
    }

    // 22. Проверяет равенство строк после замены подстрок
    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1,
                                                     String string2, String replaceInStr2, String replaceByInStr2) {
        String replaced1 = string1.replace(replaceInStr1, replaceByInStr1);
        String replaced2 = string2.replace(replaceInStr2, replaceByInStr2);
        return replaced1.equals(replaced2);
    }

    // 23. Проверяет, является ли строка палиндромом после удаления пробелов
    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        String cleaned = string.replaceAll("\\s+", "").toLowerCase();
        return isPalindromeIgnoreCase(cleaned);
    }

    // 24. Проверяет равенство строк после удаления пробелов по краям
    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return string1.trim().equals(string2.trim());
    }

    // 25. Создает CSV-строку из массива целых чисел
    public static String makeCsvStringFromInts(int[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        StringJoiner joiner = new StringJoiner(",");
        for (int num : array) {
            joiner.add(String.valueOf(num));
        }
        return joiner.toString();
    }

    // 26. Создает CSV-строку из массива вещественных чисел
    public static String makeCsvStringFromDoubles(double[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        DecimalFormat df = new DecimalFormat("#.00");
        StringJoiner joiner = new StringJoiner(",");
        for (double num : array) {
            joiner.add(df.format(num));
        }
        return joiner.toString();
    }

    // 27. То же, что и 25, но возвращает StringBuilder
    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        StringBuilder builder = new StringBuilder();
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                builder.append(array[i]);
                if (i < array.length - 1) {
                    builder.append(",");
                }
            }
        }
        return builder;
    }

    // 28. То же, что и 26, но возвращает StringBuilder
    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        StringBuilder builder = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.00");
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                builder.append(df.format(array[i]));
                if (i < array.length - 1) {
                    builder.append(",");
                }
            }
        }
        return builder;
    }

    // 29. Удаляет символы из строки
    public static StringBuilder removeCharacters(String string, int[] positions) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = positions.length - 1; i >= 0; i--) {
            builder.deleteCharAt(positions[i]);
        }
        return builder;
    }

    // 30. Вставляет символы в строку
    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < positions.length; i++) {
            builder.insert(positions[i] + i, characters[i]); // Учитываем сдвиг
        }
        return builder;
    }
}
