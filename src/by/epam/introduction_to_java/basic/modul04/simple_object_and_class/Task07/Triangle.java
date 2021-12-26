package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07;


/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private double height;
    private double degreeA;
    private double degreeB;
    private double degreeC;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDegreeA() {
        return degreeA;
    }

    public void setDegreeA(double degreeA) {
        this.degreeA = degreeA;
    }

    public double getDegreeB() {
        return degreeB;
    }

    public void setDegreeB(double degreeB) {
        this.degreeB = degreeB;
    }

    public double getDegreeC() {
        return degreeC;
    }

    public void setDegreeC(double degreeC) {
        this.degreeC = degreeC;
    }
}
