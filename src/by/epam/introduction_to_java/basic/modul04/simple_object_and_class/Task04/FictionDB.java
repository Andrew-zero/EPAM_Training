package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04;

public class FictionDB {
    private static final int CAPACITY_DEPO = 5;

    public FictionDB(){}

    private Train[] depo = new Train[CAPACITY_DEPO];

    public Train[] getDepo() {
        return depo;
    }

    public void setDepo(Train[] depo) {
        this.depo = depo;
    }
}
