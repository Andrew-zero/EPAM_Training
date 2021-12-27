package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07;


/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double a;
    private double b;
    private double c;
    private double height;
    private float degreeA;
    private float degreeB;
    private float degreeC;

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(double a){
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public Triangle(double a, double c){
        this.a = a;
        this.b = a;
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, float degreeA, float degreeB){
        this.a = a;
        this.degreeA = degreeA;
        this.degreeB = degreeB;
    }

    public Triangle(double a, double b, float degreeA){
        this.a = a;
        this.b = b;
        this.degreeA = degreeA;
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

    public float getDegreeA() {
        return degreeA;
    }

    public void setDegreeA(float degreeA) {
        this.degreeA = degreeA;
    }

    public float getDegreeB() {
        return degreeB;
    }

    public void setDegreeB(float degreeB) {
        this.degreeB = degreeB;
    }

    public float getDegreeC() {
        return degreeC;
    }

    public void setDegreeC(float degreeC) {
        this.degreeC = degreeC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
