package by.epam.introduction_to_java.basic.modul05.Task05.mockDB;

import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.abstract1.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.PeonyFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.RoseFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.TulipFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.CellophaneFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.PaperFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

import java.util.HashMap;
import java.util.Map;


public class mockDB {
    private static Map<Integer, Flower> mockMapFlower = new HashMap<>();
    private static Map<Integer, Wrap> mockMapPackage = new HashMap<>();

    static {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                mockMapFlower.put(i, RoseFactory.getInstance().createFlower(FlowerType.ROSE));
                mockMapPackage.put(i, PaperFactory.getInstance().createWrap(WrapType.PAPER));
            } else if (i % 2 == 0) {
                mockMapFlower.put(i, TulipFactory.getInstance().createFlower(FlowerType.TULIP));
                mockMapPackage.put(i, CellophaneFactory.getInstance().createWrap(WrapType.CELLOPHANE));
            } else {
                mockMapFlower.put(i, PeonyFactory.getInstance().createFlower(FlowerType.PEONY));
                mockMapPackage.put(i, CellophaneFactory.getInstance().createWrap(WrapType.CELLOPHANE));
            }
        }
    }

    public static Map<Integer, Flower> getMockMapFlower() {
        return mockMapFlower;
    }

    public static Map<Integer, Wrap> getMockMapPackage() {
        return mockMapPackage;
    }
}
