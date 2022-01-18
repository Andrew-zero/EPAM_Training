package by.epam.introduction_to_java.basic.modul03.string_how_array;


import java.util.Arrays;

/*

5.	Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.

 */
public class Task05 {

    public static String testString = "  fjwoenmf word mwpermwordm;l oermword  wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        System.out.println(new Task05().removeRedundantSpace(testString));
    }

    public char[] removeRedundantSpace(String s) {
        char[] chars = s.toCharArray();
        int firstIndex = 0;
        int lastIndex = chars.length - 1;

        while (true) {
            if (chars[firstIndex] == ' ') {
                firstIndex++;
            } else {
                break;
            }
        }
        while (true) {
            if (chars[lastIndex] == ' ') {
                lastIndex--;
            } else {
                break;
            }
        }

        char[] newArray = new char[chars.length - firstIndex + lastIndex];
        System.arraycopy(chars, firstIndex, newArray, 0, chars.length - firstIndex + lastIndex);

        return newArray;
    }
}
