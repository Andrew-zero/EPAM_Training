package by.epam.introduction_to_java.basic.modul05.Task05.mockDB;

import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.*;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Wrap;

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
                    packageList.add(WrapPaperFactory.getInstance().createPackage(WrapType.PAPER));
                }else if (i%2 == 0){
                    flowerList.add(TulipFactory.getInstance().createFlower(FlowerType.TULIP));
                    packageList.add(WrapCellophaneFactory.getInstance().createPackage(WrapType.CELLOPHANE));
                }else{
                    flowerList.add(PeonyFactory.getInstance().createFlower(FlowerType.PEONY));
                    packageList.add(WrapCellophaneFactory.getInstance().createPackage(WrapType.CELLOPHANE));
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
