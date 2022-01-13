package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.view;

import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Destination;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.Option;
import by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task05.entity.Tour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViewHelper {

    public ViewHelper() {
    }

    public Destination choiceDestination(int number){
        if(number <0 || number >= Destination.values().length){
            throw new IllegalArgumentException();
        }

        return Destination.values()[number];
    }

    public Option choiceOption(int number) {
        if(number <0 || number >= Option.values().length){
            throw new IllegalArgumentException();
        }

        return Option.values()[number];
    }

    public boolean choiceBoolean(String s) {
        return s.equals("Y") ? true : false;
    }

    public String inputChoice() {
        String result = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int inputInt() {
        int result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            result = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void print(Option options) {
        for (Option o : options.values()) {
            print(o.ordinal() + " " + o.getDescribe());
        }
    }

    public void print(Tour tour){
        System.out.println(tour.toString());
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
