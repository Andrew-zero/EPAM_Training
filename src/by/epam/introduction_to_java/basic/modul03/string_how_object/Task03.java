package by.epam.introduction_to_java.basic.modul03.string_how_object;





/*

3.	Проверить, является ли заданное слово палиндромом.

 */
public class Task03 {
    public static String testString = "TENET";
    public static String testString2 = "TENETA";

    public static void main(String[] args) {
        System.out.println(new Task03().isPalindrome(testString));
        System.out.println(new Task03().isPalindrome(testString2));
    }

    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);

        return s.equals(sb.reverse().toString());
    }
}
