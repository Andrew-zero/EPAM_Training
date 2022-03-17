package by.epam.introduction_to_java.basic.modul05.Task04.bean;


import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave implements Serializable {

    @Serial
    private static final long serialVersionUID = 100000000L;

    private List<Treasure> treasureList = new ArrayList<>();
    private Dragon dragon;
    private boolean isDragon;
    private boolean isTreasure;

    public Cave() {
    }

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

    public boolean isDragon() {
        return isDragon;
    }

    public void setIsDragon(boolean isDragon) {
        this.isDragon = isDragon;
    }

    public boolean isTreasure() {
        return isTreasure;
    }

    public void setIsTreasure(boolean isTreasure) {
        this.isTreasure = isTreasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return isDragon == cave.isDragon && isTreasure == cave.isTreasure && Objects.equals(dragon, cave.dragon) && Objects.equals(treasureList, cave.treasureList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dragon, treasureList, isDragon, isTreasure);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "treasureList=" + treasureList +
                ", dragon=" + dragon +
                ", isDragon=" + isDragon +
                ", isTreasure=" + isTreasure +
                '}';
    }
}
