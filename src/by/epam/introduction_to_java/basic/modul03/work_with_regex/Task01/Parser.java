package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task01;


import java.util.regex.Pattern;

/*
1.	Cоздать приложение, разбирающее текст (текст хранится в строке) и
позволяющее выполнять с текстом три различных операции:
- отсортировать абзацы по количеству предложений;
- в каждом предложении отсортировать слова по длине;
- отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */
public class Parser {



    public static String[] parseParagraph(String s){
        Pattern pattern = Pattern.compile("\n");

        return pattern.split(s);
    }

    public static String[] parseSentence(String s){
        Pattern pattern = Pattern.compile("[!?.]");

        return pattern.split(s);
    }

    public static String[] parseWord(String s){
        Pattern pattern = Pattern.compile("\\b");

        return pattern.split(s);
    }
}
