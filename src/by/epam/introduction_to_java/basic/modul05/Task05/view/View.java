package by.epam.introduction_to_java.basic.modul05.Task05.view;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.FlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Wrap;


public class View {

    public View() {
    }

    public void viewFlower(Flower flower){
        System.out.println(flower.toString());
    }

    public void viewPackage(Wrap aPackage){
        System.out.println(aPackage.toString());
    }

    public void viewComposition(by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.FlowerComposition flowerComposition){
        FlowerComposition abstractFlowerComposition = (FlowerComposition) flowerComposition;

        System.out.println(abstractFlowerComposition.getName());

//        for(Flower f : )
    }
}
