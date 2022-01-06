package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task01;


public class Sentence {
    private String sentence;

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(Word word) {
        this.sentence = sentence + " " + word.getWord();
    }
}
