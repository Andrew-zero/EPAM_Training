package by.epam.introduction_to_java.basic.modul03.string_how_object;


/*

10.	Строка X состоит из нескольких предложений,
каждое из которых кончается точкой, восклицательным или вопросительным знаком.
Определить количество предложений в строке X.

 */
public class Task10 {

    public static String testString = " fjwoaenmf word mwpeaaaaardm;l.  oerFDJrd wordjwljo!    1word word2 43word342j? ()@$word(& .";

    public static void main(String[] args) {
        Task10 task10 = new Task10();

        System.out.println(task10.countSentences("Количество предложений в строке: " + testString));
    }

    public int countSentences(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                result++;
            }
        }

        return result;
    }
}
