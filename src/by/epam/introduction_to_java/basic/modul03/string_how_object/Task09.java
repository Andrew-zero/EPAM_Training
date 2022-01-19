package by.epam.introduction_to_java.basic.modul03.string_how_object;


/*

9.	Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
Учитывать только английские буквы.

 */
public class Task09 {

    public static String testString = " fjwoaenmf word mwpeaaaaardm;l  oerFDJrd wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        Task09 task09 = new Task09();
        int[] res = task09.countLetters(testString);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public int[] countLetters(String s) {
        int[] result = {0, 0}; //в рамках задачи индекс:
                               // 0 - количество маленьких букв
                               // 1 - количество больших букв.

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {         //65 - 90 - upper case letter
                result[0]++;
            }
            if (c >= 97 && c <= 122) {        //97-122 - camel case letter;
                result[1]++;
            }
        }

        return result;
    }
}
