package by.epam.introduction_to_java.basic.modul03.string_how_object;


/*

2.	В строке вставить после каждого символа 'a' символ 'b'.

 */
public class Task02 {

    public static String testString = " fjwoaenmf word mwpeaaaaardm;l  oermword wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        System.out.println(new Task02().insertionChar(testString, 'a', 'b'));
    }

    public String insertionChar(String s, char firstChar, char secondChar) {
        String first = String.valueOf(firstChar);
        String replacement = first + secondChar;

        return s.replace(first, replacement);
    }
}
