package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task01;


import java.util.Arrays;
import java.util.Comparator;

/*
Работа с регулярными выражениями (Pattern, Matcher)
1.	Cоздать приложение, разбирающее текст (текст хранится в строке) и
позволяющее выполнять с текстом три различных операции:




 */
public class Logic {

    //    - отсортировать абзацы по количеству предложений;
    public String sortByCountSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] paragraphArray = Parser.parseParagraph(s);

        Arrays.sort(paragraphArray, Comparator.comparing(paragraph -> Parser.parseSentence(paragraph).length));

        for (String sentence : paragraphArray) {
            sb.append(sentence).append("\n");
        }

        return sb.toString();
    }

    //- в каждом предложении отсортировать слова по длине;
    public String sortByLengthWord(String s) {
        StringBuilder sb = new StringBuilder();
        char lastSign = s.charAt(s.length() - 1);
        String[] wordArray = Parser.parseWord(s);

        Arrays.sort(wordArray, Comparator.comparing(word -> word.length()));

        for (String word : wordArray) {
            sb.append(word).append(" ");
        }

        sb.trimToSize();
        sb.append(lastSign);

        return sb.toString();
    }

    //- отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
    public String sortByInsertionSign(String s, char c) {
        StringBuilder sb = new StringBuilder();
        String[] wordArray = Parser.parseWord(s);

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return 0;
            }
        };

        return null;
    }


}
