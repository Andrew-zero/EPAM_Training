package by.epam.introduction_to_java.basic.modul05.Task05.mockDB;

import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.PeonyFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.RoseFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.TulipFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.CellophaneFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.PaperFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class mockDB {
    private static Map<Integer, List<Flower>> mockMapFlower;
    private static Map<Integer, List<Wrap>> mockMapPackage;

    static {
        for(int i = 0; i < 100; i++){
            List<Flower> flowerList = new ArrayList<>();
            List<Wrap> packageList = new ArrayList<>();

            for(int j = 0; j < 100; j++){
                if(i%3 == 0){
                    flowerList.add(RoseFactory.getInstance().createFlower(FlowerType.ROSE));
                    packageList.add(PaperFactory.getInstance().createWrap(WrapType.PAPER));
                }else if (i%2 == 0){
                    flowerList.add(TulipFactory.getInstance().createFlower(FlowerType.TULIP));
                    packageList.add(CellophaneFactory.getInstance().createWrap(WrapType.CELLOPHANE));
                }else{
                    flowerList.add(PeonyFactory.getInstance().createFlower(FlowerType.PEONY));
                    packageList.add(CellophaneFactory.getInstance().createWrap(WrapType.CELLOPHANE));
                }
            }

            mockMapFlower.put(i, flowerList);
            mockMapPackage.put(i, packageList);
        }
    }

    public static Map<Integer, List<Flower>> getMockMapFlower() {
        return mockMapFlower;
    }

    public static Map<Integer, List<Wrap>> getMockMapPackage() {
        return mockMapPackage;
    }
}
