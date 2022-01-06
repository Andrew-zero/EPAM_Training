package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task01;

public class Main {

    public static void main(String[] args) {
        Word wordTitle = new Word("Заголовок");
        Sentence sentence = new Sentence("Набор слов");
        Text text = new Text();

        text.setTitle(wordTitle);
        text.setBodyText(sentence);

        System.out.println(text.getTitle());
        System.out.println(text.getBodyText());
    }
}
