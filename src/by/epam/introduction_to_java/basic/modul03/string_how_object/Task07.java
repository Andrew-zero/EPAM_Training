package by.epam.introduction_to_java.basic.modul03.string_how_object;





/*

7.	Вводится строка.
Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".

 */
public class Task07 {

    public static String testString = " fjwoaenmf word mwpeaaaaardm;l  oermword wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        Task07 task07 = new Task07();
        System.out.println(task07.removeDualSymbol(testString));
    }

    char[] c = testString.toCharArray();

    public String removeDualSymbol(String s){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(!sb.toString().contains(String.valueOf(c)) && c != ' '){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
