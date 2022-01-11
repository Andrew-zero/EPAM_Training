package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.view;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.Entity.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/*
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 */
public class ViewTrain {

    public ViewTrain() {
    }

    public void viewInfo(Train[] trains, int trainNumber) {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                String message = "Destination - %s, train number - %d, departure time - %t";
                helpView(message, trains[i].getDestination(), trains[i].getTrainNumber(), trains[i].getDepartTime());
            }
            if (i == trains.length - 1 && trains[i].getTrainNumber() != trainNumber) {
                String message = "Поезда с номером %s не существует.";
                helpView(message, i);
            }
        }
    }

    public void viewAllInfo(Train[] trains) {
        for (Train train : trains) {
            String message = "Destination - %s, train number - %d, departure time - %t";
            helpView(message, train.getDestination(), train.getTrainNumber(), train.getDepartTime());
        }
    }

    public int inputTrainNumber() {
        int inputNumber;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            helpView("Введите номер поезда");
            inputNumber = Integer.parseInt(br.readLine());

            while (inputNumber < 0) {
                helpView("Вы ввели неверный номер поезда");
                inputNumber = Integer.parseInt(br.readLine());
            }

            return inputNumber;
        } catch (IOException e) {
            e.getCause();
        }

        return -1; // stab
    }

    public void helpView(String s) {
        System.out.print(s);
    }

    public void helpView(String s, int number) {
        System.out.printf(s, number);
    }

    public void helpView(String s, String dest, int number, Date date) {
        System.out.printf(s, dest, number, date);
    }

}
