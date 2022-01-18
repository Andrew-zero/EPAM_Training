package by.epam.introduction_to_java.basic.modul03.string_how_array;


/*

4.	В строке найти количество чисел.

 */
public class Task04 {
    public static String testString = "fjwoenmf word mwpermwordm;l oermword wordjwljo, 1word word2 43word342j ()@$word(&";

    public static void main(String[] args) {
        System.out.println(new Task04().countNumbers(testString));
    }

    public int countNumbers(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        boolean lock = true;

        for (int i = 0; i < chars.length; i++) {

            if (Character.isDigit(chars[i])) {
                if (lock) {
                    result++;
                    lock = false;
                }
            } else {
                lock = true;
            }
        }

        return result;
    }

}
