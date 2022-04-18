package by.epam.introduction_to_java.basic.modul05.Task05.view;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.FlowerShop;


public class View {

    public View() {
    }

    public void viewFlower(Flower flower){
        System.out.println(flower.toString());
    }

    public void viewPackage(Wrap aPackage){
        System.out.println(aPackage.toString());
    }

    public void viewComposition(FlowerShop flowerComposition){
        Bouquet abstractFlowerComposition = (Bouquet) flowerComposition;

        System.out.println(abstractFlowerComposition.getType());

//        for(Flower f : )
    }
}
