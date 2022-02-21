package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task02;



public enum TegType {

    OPEN_TEG("Открывающий тег"),
    CLOSE_TET("Закрывающий тег"),
    CONTENT_TEG("Содержимое тега"),
    WITHOUT_BODY_TEG("Тег без тела");

    private String name;

    TegType(String s){
        name = s;
    }

    public String getName() {
        return name;
    }
}
