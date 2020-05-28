package nl.thecheerfuldev.mymod.util.helpers;

public class ItemNameHelper {

    public static String convertToItemName(final String className) {
        final char[] chars = className.toCharArray();
        final char[] snakeCase = new char[chars.length + numberOfUppercaseChars(chars)];
        snakeCase[0] = chars[0];
        int y = 0;
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                snakeCase[i + y] = '_';
                y++;
                snakeCase[i + y] = chars[i];
            }
            snakeCase[i + y] = chars[i];
        }
        return new String(snakeCase).toLowerCase();
    }

    private static int numberOfUppercaseChars(final char[] chars) {
        int count = 0;
        for (final char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                count++;
            }
        }
        return count - 1;
    }

}
