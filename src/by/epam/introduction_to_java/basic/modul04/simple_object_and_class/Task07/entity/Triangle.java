package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.entity;


import java.util.Objects;

/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double sideA;
    private double sideB;
    private double sideC;
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

    public Triangle(double sideA){
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }

    public Triangle(double sideA, double c){
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = c;
    }

    public Triangle(double sideA, double b, double c) {
        this.sideA = sideA;
        this.sideB = b;
        this.sideC = c;
    }

    public Triangle(double sideA, float degreeA, float degreeB){
        this.sideA = sideA;
        this.degreeA = degreeA;
        this.degreeB = degreeB;
    }

    public Triangle(double sideA, double b, float degreeA){
        this.sideA = sideA;
        this.sideB = b;
        this.degreeA = degreeA;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0 && Double.compare(triangle.sideB, sideB) == 0 && Double.compare(triangle.sideC, sideC) == 0 && Double.compare(triangle.height, height) == 0 && Float.compare(triangle.degreeA, degreeA) == 0 && Float.compare(triangle.degreeB, degreeB) == 0 && Float.compare(triangle.degreeC, degreeC) == 0 && Objects.equals(pointA, triangle.pointA) && Objects.equals(pointB, triangle.pointB) && Objects.equals(pointC, triangle.pointC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointA, pointB, pointC, sideA, sideB, sideC, height, degreeA, degreeB, degreeC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", a=" + sideA +
                ", b=" + sideB +
                ", c=" + sideC +
                ", height=" + height +
                ", degreeA=" + degreeA +
                ", degreeB=" + degreeB +
                ", degreeC=" + degreeC +
                '}';
    }
}
