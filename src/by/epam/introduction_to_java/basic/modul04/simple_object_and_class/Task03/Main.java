package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task03;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task03.Student;

public class Main {

    public static void main(String[] args) {
        StudentLogic studentLogic = new StudentLogic();
        Student[] groupOfStudent = studentLogic.initializeStudent();

        for(Student s : groupOfStudent){
            if(studentLogic.isTopStudent(s.getArrayMark())){
                ViewStudent.view(s.getSurNameAndInitials(), s.getGroupNumber());
                System.out.println();
            }
        }
    }
}
