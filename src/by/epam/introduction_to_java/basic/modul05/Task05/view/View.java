package by.epam.introduction_to_java.basic.modul05.Task05.view;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class View {
    private Validate validate = new Validate();

    public View() {
    }

    public void print(String s) {
        System.out.println(s);
    }

    public void viewFlower(Flower flower) {
        System.out.println(flower.toString());
    }

    public void viewPackage(Wrap wrap) {
        System.out.println(wrap.toString());
    }

    public void viewBouquet(Bouquet bouquet) {
        System.out.println(bouquet.toString());
    }

    public void choseBouquet() {
        String s = "Выберите тип букета: ";
        print(s);

        for (BouquetType t : BouquetType.values()) {
            print(t.name());
        }
    }

    public BouquetType getBouquetType() {

        String type = readBouquetType().toUpperCase();

        return BouquetType.valueOf(type);
    }

    public String readBouquetType() {
        String result = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                choseBouquet();

                result = br.readLine();
                if (validate.validateOne(result) || validate.validateTwo(result)) {
                    return result;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}
