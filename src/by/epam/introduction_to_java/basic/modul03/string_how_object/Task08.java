package by.epam.introduction_to_java.basic.modul03.string_how_object;





/*

8.	Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.

 */
public class Task08 {

    public static String testString = " fjwoaenmf word mwpeaaaaardm;l  oermword wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        Task08 task08 = new Task08();

        System.out.println(task08.findMaxLengthWord(testString));
    }

    public String findMaxLengthWord(String s){
        String[] s1 = s.split(" ");
        String maxLengthString = "";

        for(String s2 : s1){
            if(s2.length() > maxLengthString.length()){
                maxLengthString = s2;
            }
        }

        return maxLengthString;
    }
}
