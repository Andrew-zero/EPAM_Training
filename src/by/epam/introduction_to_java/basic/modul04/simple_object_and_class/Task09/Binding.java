package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;

public enum Binding {
    SOFT("Мягкий переплёт"),
    HARD("Твёрдый переплёт");

    private String description;

    Binding(String description) {
        this.description = description;
    }
}
