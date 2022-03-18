package by.epam.introduction_to_java.basic.modul05.Task04.view;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Cave;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Dragon;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class View {
    private Menu menu;

    public View() {

    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int inputNumber() {
        int result = 0;

        try {
            result = Integer.parseInt(menu.getBufferedReader().readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public String inputFileName() {
        String result = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void printTreasureList(List<Treasure> treasureList) {
        String structureTreasure = "\t\t Name" + "\t\t\t\tType\t\t" + "\t\t\t\t\t\t  Price";
        System.out.println(structureTreasure);

        for (Treasure t : treasureList) {
            System.out.println(t);
        }
    }

    public void printTreasure(Treasure treasure) {
        String structureTreasure = "\t\t Name " + "Type\t\t" + "Price";

        System.out.println(structureTreasure);
        System.out.println(treasure);

    }

    public void printDragon(Dragon dragon) {
        System.out.println(dragon);
    }

    public void printCave(Cave cave) {
        String structureTreasure = "\t\t Name " + "Type\t\t" + "Price";

        System.out.println(structureTreasure);
        System.out.println(cave);
    }

    public void printMessage(String s) {
        System.out.println(s);
    }
}
