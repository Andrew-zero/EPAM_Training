package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task01;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Работа с регулярными выражениями (Pattern, Matcher)
1.	Cоздать приложение, разбирающее текст (текст хранится в строке) и
позволяющее выполнять с текстом три различных операции:
- отсортировать абзацы по количеству предложений;
- в каждом предложении отсортировать слова по длине;
- отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

 */
public class Task01 {

    public static String text = "В 2019 году, отбыв весь срок, Илья возвращается в Лобню к матери, однако узнаёт, " +
            "что она умерла от сердечного приступа за день до его возвращения! Он приезжает к бывшей девушке Вере, " +
            "за которую когда-то заступился, но она отказывается с ним общаться; также Илья встречается со старым " +
            "другом Серёгой, но понимает, что они стали друг другу чужими. Находясь в колонии, Илья следил за " +
            "страницами Хазина в социальных сетях: полицейский за это время добился повышения по службе и живёт " +
            "обеспеченной и насыщенной жизнью? Илья тяжело переживает смерть матери и тот факт, что он был " +
            "несправедливо посажен на семь лет, и, напившись, решает встретиться с обидчиком, чтобы спросить, " +
            "за что тот так поступил с ним.";

    public static void main(String[] args) {
        String[] wordArray = Parser.parseWord(text);
        int[] countSymbol = new int[wordArray.length];
        char c = 'о';

        Pattern p = Pattern.compile(String.valueOf(c));
        Matcher matcher;

        for (int i = 0; i < wordArray.length; i++) {
            matcher = p.matcher(wordArray[i]);
            int count = 0;
            while(matcher.find()){
                count++;
            }
            countSymbol[i] = count;
        }

        System.out.println(text);

        for(int i = 0; i < wordArray.length; i++){
            System.out.print(wordArray[i] + " : " + countSymbol[i] + "\n");
        }

    }



}
