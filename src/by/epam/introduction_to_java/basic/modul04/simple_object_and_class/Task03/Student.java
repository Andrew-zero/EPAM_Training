package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task03;


import java.util.Arrays;
import java.util.Objects;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
    private static final int NUMBER_OF_RATINGS = 5;

    private String surNameAndInitials;
    private int groupNumber;
    private int[] arrayMark = new int[NUMBER_OF_RATINGS];

    public Student() {
    }

    public Student(String surName, int groupNumber) {
        this.surNameAndInitials = surName;
        this.groupNumber = groupNumber;
    }

    public void setSurNameAndInitials(String surNameAndInitials) {
        this.surNameAndInitials = surNameAndInitials;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setArrayMark(int[] arrayMark) {
        this.arrayMark = arrayMark;
    }

    public String getSurNameAndInitials() {
        return surNameAndInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getArrayMark() {
        return arrayMark;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber && Objects.equals(surNameAndInitials, student.surNameAndInitials) && Arrays.equals(arrayMark, student.arrayMark);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(surNameAndInitials, groupNumber);
        result = 31 * result + Arrays.hashCode(arrayMark);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surNameAndInitials='" + surNameAndInitials + '\'' +
                ", groupNumber=" + groupNumber +
                ", arrayMark=" + Arrays.toString(arrayMark) +
                '}';
    }
}

