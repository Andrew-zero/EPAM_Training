package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task01;


/*
1.	Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Text {
    private String title;
    private Sentence sentence;
    private Word word;
    private StringBuilder sb = new StringBuilder();

    public Text() {
    }

    public Text(String title) {
        this.title = title;
    }


}
