package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task01;


/*
1.	Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Text {
    private String title;
    private StringBuilder bodyText = new StringBuilder();

    public Text() {
    }

    public Text(String title) {
        this.title = title;
    }

    public Text(Word word) {
        title = word.getWord();
    }

    public Text(Sentence sentence) {
        this.title = sentence.getSentence();
    }

    public String getTitle() {
        return title;
    }

    public String getBodyText() {
        return bodyText.toString();
    }

    public void setTitle(Word word) {
        this.title = "\t\t\t" + word.getWord();
    }

    public void setTitle(Sentence sentence) {
        this.title = "\t\t\t" + sentence.getSentence();
    }

    public void setBodyText(Word word) {
        bodyText.append(" ").append(word.getWord());
    }

    public void setBodyText(Sentence sentence) {
        bodyText.append(" ").append(sentence.getSentence());
    }
}
