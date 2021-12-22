package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task03;

public class StudentLogic {

    public StudentLogic(){}

    public Student[] initializeStudent() {
        Student[] groupOfStudent = new Student[10];

        for (int i = 0; i < groupOfStudent.length; i++) {
            String surName = "SurName" + " " + i;
            int groupNumber = 1;
            groupOfStudent[i] = new Student(surName, groupNumber);
        }

        int mark = 1;
        for (Student s : groupOfStudent) {
            int[] arrayMark = {mark, mark, mark, mark, mark};
            mark++;
            s.setArrayMark(arrayMark);
        }

        return groupOfStudent;
    }

    public boolean isTopStudent(int[] arrayMark) {
        for (int k : arrayMark) {
            if (k < 9) {
                return false;
            }
        }

        return true;
    }
}
