package by.epam.introduction_to_java.basic.modul05.Task05.view;

import by.epam.introduction_to_java.basic.modul05.Task05.service.command.AbstractBouquet;
import by.epam.introduction_to_java.basic.modul05.Task05.service.command.interface1.FlowerComposition;


public class View {

    public View() {
    }

    public void viewFlower(Flower flower){
        System.out.println(flower.toString());
    }

    public void viewPackage(Wrap aPackage){
        System.out.println(aPackage.toString());
    }

    public void viewComposition(FlowerComposition flowerComposition){
        AbstractBouquet abstractFlowerComposition = (AbstractBouquet) flowerComposition;

        System.out.println(abstractFlowerComposition.getName());

//        for(Flower f : )
    }
}
