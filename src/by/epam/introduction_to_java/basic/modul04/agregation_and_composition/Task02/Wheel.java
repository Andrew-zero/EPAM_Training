package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task02;

public class Wheel {
    private double diameter;
    private String brand;
    private Type type;

    public Wheel(){}

    public Wheel(double diameter, String brand, Type type) {
        this.diameter = diameter;
        this.brand = brand;
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getBrand() {
        return brand;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                '}';
    }
}
