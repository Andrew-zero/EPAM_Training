package by.epam.introduction_to_java.basic.modul03.string_how_array;


/*

5.	Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.

 */
public class Task05 {

    public static String testString = "  fjwoenmf word mwpermwordm;l oermword wordjwljo, 1word word2 43word342j ()@$word(& ";
    public static String testString2 = "  fjwoenmf  ";

    public static void main(String[] args) {
        System.out.println(new Task05().removeRedundantSpace(testString));
    }

    public char[] removeRedundantSpace(String s) {
        char[] chars = trimSideSpace(s);
        char[] charsResult = trimInnerSpace(chars);

        return charsResult;
}

    public char[] trimInnerSpace(char[] chars){
        char[] charsResult = new char[chars.length];
        int i = 0;
        int j = 0;

        while (i < chars.length) {

            if (chars[i] == ' ' && chars[i + 1] == ' ') {
                i++;
                continue;
            }

            charsResult[j] = chars[i];
            j++;
            i++;
        }

        return charsResult;
    }

    public char[] trimSideSpace(String s) {
        char[] chars = s.toCharArray();
        int firstIndex = 0;
        int lastIndex = chars.length - 1;
        int totalIndex = 0;

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
                totalIndex++;
            } else {
                break;
            }
        }

        totalIndex += firstIndex;
        char[] newArray = new char[chars.length - totalIndex];
        System.arraycopy(chars, firstIndex, newArray, 0, chars.length - totalIndex);

        return newArray;
    }
}
