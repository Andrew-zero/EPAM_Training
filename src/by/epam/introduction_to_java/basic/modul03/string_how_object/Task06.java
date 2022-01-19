package by.epam.introduction_to_java.basic.modul03.string_how_object;



/*

6.	Из заданной строки получить новую, повторив каждый символ дважды.

 */
public class Task06 {

    public static String testString = " fjwoaenmf word mwpeaaaaardm;l  oermword wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        Task06 task06 = new Task06();

        System.out.println(task06.doubledSymbol(testString));
    }

    public String doubledSymbol(String s){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            sb.append(c).append(c);
        }

        return sb.toString();
    }
}
