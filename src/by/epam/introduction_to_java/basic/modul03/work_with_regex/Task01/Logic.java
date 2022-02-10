package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task01;


import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        int[] countSymbol = new int[wordArray.length];

        Pattern p = Pattern.compile(String.valueOf(c));
        Matcher matcher;

        for (int i = 0; i < wordArray.length; i++) {
            int count = 0;
            matcher = p.matcher(wordArray[i]);

            while (matcher.find()) {
                count++;
            }

            countSymbol[i] = count;
        }

        wordArray = sortByShell(wordArray, countSymbol);

        int index = 0;
        for (int i = 0; i < countSymbol.length; i++) {
            if (countSymbol[i] > index) {
                index = countSymbol[i];

                for (int j = 0; j < i - 1; j++) {
                    for (int k = j + 1; k < i - 2; k++) {

                        int n = wordArray[j].compareTo(wordArray[k]);
                        if (n > 0) {
                            String temp = wordArray[j];
                            wordArray[j] = wordArray[k];
                            wordArray[k] = temp;
                        }
                    }
                }
            }

        }

        return null;
    }

    public String[] sortByShell(String[] wordArray, int[] countSymbol) {
        int d = wordArray.length >> 1;

        while (d > 0) {
            for (int i = 0; i < (wordArray.length - d); i++) {
                int j = i;

                while ((j >= 0) && countSymbol[i] < countSymbol[j + d]) {
                    String temp = wordArray[j];
                    wordArray[j] = wordArray[j + d];
                    wordArray[j + d] = temp;

                    int temp2 = countSymbol[j];
                    countSymbol[j] = countSymbol[j + d];
                    countSymbol[j + d] = temp2;

                    j--;
                }
            }
            d = d >> 1;
        }

        return wordArray;
    }


}
