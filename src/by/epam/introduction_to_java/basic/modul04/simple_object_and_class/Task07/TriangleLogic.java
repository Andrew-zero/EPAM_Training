package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07;

/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.
 */
public class TriangleLogic {

    public static double perimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public static double squareByTreeSide(Triangle triangle) {
        double p = perimeter(triangle) / 2;

        return Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }

    private static double squareByFoundationAndHeight(Triangle triangle) {
        return 1.5 * triangle.getA() * triangle.getHeight();
    }

    private static double squareBy2SideAndDegree(Triangle triangle) {
        return 1.5 * triangle.getA() * triangle.getB() * triangle.getDegreeA();
    }

    public static double squareBySideAndTwoDegree(Triangle triangle) {
        double part1 = Math.pow(triangle.getA(), 2) / 2;
        double part2 = Math.sin(triangle.getDegreeA()) + Math.sin(triangle.getDegreeB());
        double part3 = Math.sin(180 - (triangle.getDegreeA() + triangle.getDegreeB()));

        return part1 + (part2 / part3);
    }

    public static double medianaIntersectionPoint(Point pointA, Point pointB, Point pointC) {
        Point a1 = new Point();     // середина стороны напротив вершины А
        Point b1 = new Point();     // середина стороны напротив вершины b

        a1.setX((pointB.getX() + pointC.getX()) / 2);
        a1.setY((pointB.getY() + pointC.getY()) / 2);
        b1.setX((pointA.getX() + pointC.getX()) / 2);
        b1.setY((pointA.getY() + pointC.getY()) / 2);


        Point m = new Point();                   // точка пересечения медиан

    }

}
