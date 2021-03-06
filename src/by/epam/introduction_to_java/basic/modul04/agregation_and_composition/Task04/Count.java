package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task04;

import java.util.Objects;

public class Count {
    private static int totalNumberCount = 0;
    private final int numberCount;
    private double value;
    private boolean block;

    public Count(){
        this.numberCount = totalNumberCount;
    }

    public Count(boolean block) {
        this.numberCount = totalNumberCount;
        this.value = 0;
        this.block = block;
    }

    public Count(double value, boolean block) {
        this.numberCount = totalNumberCount++;
        this.value = value;
        this.block = block;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public double getValue() {
        return value;
    }

    public boolean isBlock() {
        return block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return numberCount == count.numberCount && Double.compare(count.value, value) == 0 && block == count.block;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCount, value, block);
    }

    @Override
    public String toString() {
        return "Count{" +
                "numberCount=" + numberCount +
                ", value=" + value +
                ", block=" + block +
                '}';
    }
}
