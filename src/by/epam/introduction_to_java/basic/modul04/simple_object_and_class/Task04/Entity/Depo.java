package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04.Entity;

import java.util.Arrays;

public class Depo {
    private static final int CAPACITY_DEPO = 5;
    private Train[] depo;

    public Depo(){
        depo = new Train[CAPACITY_DEPO];
    }

    public Train[] getDepo() {
        return depo;
    }

    public void setDepo(Train[] depo) {
        this.depo = depo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depo depo1 = (Depo) o;
        return Arrays.equals(depo, depo1.depo);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(depo);
    }

    @Override
    public String toString() {
        return "Depo{" +
                "depo=" + Arrays.toString(depo) +
                '}';
    }
}
