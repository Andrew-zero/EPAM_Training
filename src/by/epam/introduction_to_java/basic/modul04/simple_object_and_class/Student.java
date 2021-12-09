package by.epam.introduction_to_java.basic.modul04.simple_object_and_class;


/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {

    private String surName;
    private String initials;
    private int groupNumber;
    private int[] arrayMark = new int[5];

    public Student() {
    }

    public Student(String surName, String initials, int groupNumber) {
        this.surName = surName;
        this.initials = initials;
        this.groupNumber = groupNumber;
    }

    public void setArrayMark(int[] arrayMark) {
        this.arrayMark = arrayMark;
    }

    public void view(){
        System.out.printf("Студент %s group № %d имеет оценки только 9 или 10", surName, groupNumber);
    }

    public String getSurName() {
        return surName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getArrayMark() {
        return arrayMark;
    }

    public boolean isTopStudent() {
        for (int k : arrayMark) {
            if (k < 9) {
                return false;
            }
        }

        return true;
    }

    public Student[] initializeStudent() {
        Student[] groupOfStudent = new Student[10];

        for (int i = 0; i < groupOfStudent.length; i++) {
            String surName = "SurName" + i;
            String initials = "Initials" + i + "Name";
            int groupNumber = 1;
            groupOfStudent[i] = new Student(surName, initials, groupNumber);
        }

        int mark = 1;
        for(Student s : groupOfStudent){
            int[] arrayMark = {mark, mark, mark, mark, mark};
            mark++;
            s.setArrayMark(arrayMark);
        }

        return groupOfStudent;
    }
}

