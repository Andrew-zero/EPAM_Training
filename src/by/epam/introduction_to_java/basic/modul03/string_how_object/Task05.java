package by.epam.introduction_to_java.basic.modul03.string_how_object;




/*

5.	Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

 */
public class Task05 {

    public static String testString = " fjwoaenmf word mwpeaaaaardm;l  oermword wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        Task05 task05 = new Task05();
        char c = 'a';

        System.out.println(task05.countSymbol(testString, c));
    }

    public int countSymbol(String s, char c){
        int countResult = 0;

        for(char c1 : s.toCharArray()){
            if(c1 == c){
                countResult++;
            }
        }

        return countResult;
    }
}
