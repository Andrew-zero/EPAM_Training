package by.epam.introduction_to_java.basic.modul05.Task05.mockDB;

import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.enam.PackageType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.*;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.interface1.Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class mockDB {
    public static Map<Integer, List<Flower>> mockMapFlower;
    public static Map<Integer, List<Package>> mockMapPackage;

    static {
        for(int i = 0; i < 100; i++){
            List<Flower> flowerList = new ArrayList<>();
            List<Package> packageList = new ArrayList<>();

            for(int j = 0; j < 100; j++){
                if(i%3 == 0){
                    flowerList.add(RoseFactory.getInstance().createFlower(FlowerType.ROSE));
                    packageList.add(PackageTypeOneFactory.getInstance().createPackage(PackageType.ONE));
                }else if (i%2 == 0){
                    flowerList.add(TulipFactory.getInstance().createFlower(FlowerType.TULIP));
                    packageList.add(PackageTypeTwoFactory.getInstance().createPackage(PackageType.TWO));
                }else{
                    flowerList.add(PionFactory.getInstance().createFlower(FlowerType.PION));
                    packageList.add(PackageTypeTwoFactory.getInstance().createPackage(PackageType.TWO));
                }
            }

            mockMapFlower.put(i, flowerList);
            mockMapPackage.put(i, packageList);
        }
    }
}
