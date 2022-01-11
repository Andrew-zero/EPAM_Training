package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07;

/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.
 */
public class TriangleLogic {

    public static double perimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

    public static double getSide(Point a, Point b) {
        double result;
        result = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));

        return result;
    }

    public static double squareByTreeSide(Triangle triangle) {
        double p = perimeter(triangle) / 2;

        return Math.sqrt(p * (p - triangle.getSideA()) * (p - triangle.getSideB()) * (p - triangle.getSideC()));
    }

    private static double squareByFoundationAndHeight(Triangle triangle) {
        return 1.5 * triangle.getSideA() * triangle.getHeight();
    }

    private static double squareBy2SideAndDegree(Triangle triangle) {
        return 1.5 * triangle.getSideA() * triangle.getSideB() * triangle.getDegreeA();
    }

    public static double squareBySideAndTwoDegree(Triangle triangle) {
        double part1 = Math.pow(triangle.getSideA(), 2) / 2;
        double part2 = Math.sin(triangle.getDegreeA()) + Math.sin(triangle.getDegreeB());
        double part3 = Math.sin(180 - (triangle.getDegreeA() + triangle.getDegreeB()));

        return part1 + (part2 / part3);
    }

    public static Point medianaIntersectionPoint(Point pointA, Point pointB, Point pointC) {
        double medianaX = (pointA.getX() + pointB.getX() + pointC.getX()) / 3;
        double medianaY = (pointA.getY() + pointB.getY() + pointC.getY()) / 3;

        return new Point(medianaX, medianaY);
    }

}
