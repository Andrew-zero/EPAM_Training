package by.epam.introduction_to_java.basic.modul03.string_how_array;


/*

3.	В строке найти количество цифр.

 */
public class Task03 {

    public static String testString = "fjwoenmf word mwpermwordm;l oermword wordjwljo, 1word word2 43word342j ()@$word(&";

    public static void main(String[] args) {
        System.out.println(new Task03().countDigit(testString));
    }

    public int countDigit(String s) {
        char[] chars = s.toCharArray();
        int result = 0;

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                result++;
            }
        }

        return result;
    }

}
