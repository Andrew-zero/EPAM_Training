package by.epam.introduction_to_java.basic.modul05.Task04.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave implements Serializable {
    private Dragon dragon;
    private List<Treasure> treasureList = new ArrayList<>();

    public Cave(){}

    public Cave(Dragon dragon) {
        this.dragon = dragon;
    }

    public Cave(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    public Cave(Dragon dragon, List<Treasure> treasureList) {
        this.dragon = dragon;
        this.treasureList = treasureList;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return Objects.equals(dragon, cave.dragon) && Objects.equals(treasureList, cave.treasureList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dragon, treasureList);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "dragon=" + dragon +
                ", treasureList=" + treasureList +
                '}';
    }
}
