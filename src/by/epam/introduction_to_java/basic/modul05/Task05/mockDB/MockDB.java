package by.epam.introduction_to_java.basic.modul05.Task05.mockDB;

import by.epam.introduction_to_java.basic.modul05.Task05.model.Flower;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.PeonyFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.RoseFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.flower.TulipFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.CellophaneFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.NylonFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.factory.wrap.PaperFactory;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.FlowerType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;
import by.epam.introduction_to_java.basic.modul05.Task05.model.Bouquet;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


public class MockDB {
    private static Map<Long, Flower> mockMapFlower = new HashMap<>();
    private static Map<Long, Wrap> mockMapWrap = new HashMap<>();
    private static Map<Long, Bouquet> mockMapBouquet = new HashMap<>();

    private static AtomicLong flowerId = new AtomicLong(0);
    private static AtomicLong wrapId = new AtomicLong(0);
    private static AtomicLong bouquetId = new AtomicLong(0);

    static {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                mockMapFlower.put(flowerId.incrementAndGet(), RoseFactory.getInstance().createFlower(FlowerType.ROSE));
                mockMapWrap.put(wrapId.incrementAndGet(), PaperFactory.getInstance().createWrap(WrapType.PAPER));
            } else if (i % 2 == 0) {
                mockMapFlower.put(flowerId.incrementAndGet(), TulipFactory.getInstance().createFlower(FlowerType.TULIP));
                mockMapWrap.put(wrapId.incrementAndGet(), CellophaneFactory.getInstance().createWrap(WrapType.CELLOPHANE));
            } else {
                mockMapFlower.put(flowerId.incrementAndGet(), PeonyFactory.getInstance().createFlower(FlowerType.PEONY));
                mockMapFlower.put(flowerId.incrementAndGet(), TulipFactory.getInstance().createFlower(FlowerType.TULIP));
                mockMapWrap.put(wrapId.incrementAndGet(), NylonFactory.getInstance().createWrap(WrapType.NYLON));
            }
        }
    }

    public static Map<Long, Flower> getMockMapFlower() {
        return mockMapFlower;
    }

    public static Map<Long, Wrap> getMockMapWrap() {
        return mockMapWrap;
    }

    public static Map<Long, Bouquet> getMockMapBouquet() {
        return mockMapBouquet;
    }

    public static void setMockMapFlower(Map<Long, Flower> mockMapFlower) {
        MockDB.mockMapFlower = mockMapFlower;
    }

    public static void setMockMapWrap(Map<Long, Wrap> mockMapWrap) {
        MockDB.mockMapWrap = mockMapWrap;
    }

    public static void setMockMapBouquet(Map<Long, Bouquet> mockMapBouquet) {
        MockDB.mockMapBouquet = mockMapBouquet;
    }

    public static void setFlowerId(AtomicLong flowerId) {
        MockDB.flowerId = flowerId;
    }

    public static void setWrapId(AtomicLong wrapId) {
        MockDB.wrapId = wrapId;
    }

    public static void setBouquetId(AtomicLong bouquetId) {
        MockDB.bouquetId = bouquetId;
    }

    public static AtomicLong getFlowerId() {
        return flowerId;
    }

    public static AtomicLong getWrapId() {
        return wrapId;
    }

    public static AtomicLong getBouquetId() {
        return bouquetId;
    }
}
