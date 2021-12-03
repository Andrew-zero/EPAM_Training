package by.epam.introduction_to_java.basic.modul02.decomposition;


/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class Task03 {

    static double sideT = 3;

    public static double hexagonSFromTriangle(double sideTriangle) {

        return triangleS(sideTriangle) * 6;
    }

    public static double triangleS(double a) {
        double p = (a * 3) / 2;

        return Math.sqrt(p * (p - a) * (p - a) * (p - a));
    }
}
