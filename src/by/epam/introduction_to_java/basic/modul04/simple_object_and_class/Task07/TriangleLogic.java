package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07;

/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.
 */
public class TriangleLogic {

    public static double squareByTreeSide(Triangle triangle) {
        double p = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;

        return Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }

    private static double squareByFoundationAndHeight(Triangle triangle) {
        return 1.5 * triangle.getA() * triangle.getHeight();
    }

    private static double squareBy2SideAndDegree(Triangle triangle) {
        return 1.5 * triangle.getA() * triangle.getB() * triangle.getDegreeA();
    }

}
