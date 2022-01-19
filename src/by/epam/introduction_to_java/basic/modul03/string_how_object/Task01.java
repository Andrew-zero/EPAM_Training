package by.epam.introduction_to_java.basic.modul03.string_how_object;


import java.util.ArrayList;
import java.util.stream.IntStream;

/*
Работа со строкой как с объектом типа String или StringBuilder
1.	Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

 */
public class Task01 {
    public static String testString = " fjwoenmf word mwpermwordm;l  oermword wordjwljo,    1word word2 43word342j ()@$word(& ";

    public static void main(String[] args) {
        System.out.println(new Task01().findMaxSpaceSequence(testString));
    }

    public int findMaxSpaceSequence(String s) {
        int maxCount = 0;
        int currentCount = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
