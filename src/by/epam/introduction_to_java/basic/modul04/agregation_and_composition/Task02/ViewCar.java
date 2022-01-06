package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViewCar {

    public ViewCar() {
    }

    public double inputDouble() {
        double quantity = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            quantity = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return quantity;
    }

    public String inputString() {
        String string = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            string = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return string;
    }

    public int inputNumber() {
        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            number = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return number;
    }

    public Type choseType() {
        int typeOrdinal = inputNumber();

        return Type.values()[typeOrdinal];
    }

    public void printType() {
        for (Type type : Type.values()) {
            System.out.println(type.ordinal() + " " + type);
        }
    }

    public void viewModelCar(Car car) {
        String message = "Модель автомобиля - " + car.getModel();
        System.out.println(message);
    }

    public void print(String message) {
        System.out.println(message);
    }
}
