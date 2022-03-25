package by.epam.introduction_to_java.basic.modul05.Task05.view;

import by.epam.introduction_to_java.basic.modul05.Task05.bean.abstract1.AbstractFlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.FlowerComposition;
import by.epam.introduction_to_java.basic.modul05.Task05.bean.interface1.Package;

public class View {

    public View() {
    }

    public void viewFlower(Flower flower){
        System.out.println(flower.toString());
    }

    public void viewPackage(Package aPackage){
        System.out.println(aPackage.toString());
    }

    public void viewComposition(FlowerComposition flowerComposition){
        AbstractFlowerComposition abstractFlowerComposition = (AbstractFlowerComposition) flowerComposition;

        System.out.println(abstractFlowerComposition.getName());

//        for(Flower f : )
    }
}
