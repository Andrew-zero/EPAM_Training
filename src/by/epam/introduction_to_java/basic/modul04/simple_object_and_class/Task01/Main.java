package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task01;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Student;

public class Main {

    public static void main(String[] args) {
        Student[] groupOfStudent = new Student().initializeStudent();
        for(Student s : groupOfStudent){
            if(s.isTopStudent()){
                s.view();
                System.out.println();
            }
        }
    }
}
