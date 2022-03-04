package by.epam.introduction_to_java.basic.modul05.Task01;


import javax.naming.InvalidNameException;

/*
Задача 1.
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить
 */
public class Main {

    public static void main(String[] args) {
        Directory directory = new Directory("C:\\somePath\\");
        TextFile textFile;
        ViewFile viewFile = new ViewFile();

        try {
            textFile = directory.createNewTextFile("NewTextFile");

            textFile.addContent("АбраКадабра");

            viewFile.print(textFile);
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }


    }
}
