package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task03;

public class ViewStudent {

    public static void view(String surNameAndInitials, int groupNumber) {
        String message = "Студент %s group № %d имеет оценки только 9 или 10";

        System.out.printf(message, surNameAndInitials, groupNumber);
    }
}
