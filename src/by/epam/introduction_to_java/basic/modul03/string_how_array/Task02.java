package by.epam.introduction_to_java.basic.modul03.string_how_array;


import java.util.Arrays;

/*

2.	Замените в строке все вхождения 'word' на 'letter'.

 */
public class Task02 {
    public static String testString = "fjwoenmf word mwpermwordm;l oermword wordjwljo, 1word word2 43word342j ()@$word(&";

    public static void main(String[] args) {
        System.out.println(new Task02().replace(testString, "word", "letter"));
    }

    public char[] replace(String str, String replaceable, String newSnippet) {
        char[] result = new char[0];
        char[] chars = str.toCharArray();
        char[] replaceableChars = replaceable.toCharArray();
        char[] newSnippetChars = newSnippet.toCharArray();
        int count = 0;
        int i = 0;
        int replaceLength = replaceable.length();
        int newSnippetLength = newSnippetChars.length;
        int resultLength = result.length;

        while (true) {
            if (i < chars.length) {
                for (int j = 0, k = i; j < replaceLength; j++, k++) {
                    if (chars[k] != replaceableChars[j]) {
                        break;
                    }
                    count++;
                }
                if (count == replaceLength) {
                    result = Arrays.copyOf(result, resultLength + newSnippetLength);

                    for (int n = 0; n < newSnippetLength; n++) {
                        result[resultLength + n] = newSnippetChars[n];
                    }

                    resultLength = result.length;
                    count = 0;
                    i += replaceLength;
                    continue;
                }
                result = Arrays.copyOf(result, resultLength + 1);
                result[resultLength] = chars[i];

                resultLength = result.length;
                count = 0;
                i++;
            } else {
                break;
            }
        }

        return result;
    }
}
