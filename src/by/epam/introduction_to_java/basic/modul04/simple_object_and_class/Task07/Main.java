package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07;

public class Main {


    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setPointA(new Point(2, -8));
        triangle.setPointB(new Point(-3, 9));
        triangle.setPointC(new Point(7, -10));

        double sideA = Math.sqrt(Math.pow(triangle.getPointB().getX() - triangle.getPointC().getX(), 2) +
                Math.pow(triangle.getPointB().getY() - triangle.getPointC().getY(), 2));
        double sideB = Math.sqrt(Math.pow(triangle.getPointA().getX() - triangle.getPointC().getX(), 2) +
                Math.pow(triangle.getPointA().getY() - triangle.getPointC().getY(), 2));
        double sideC = Math.sqrt(Math.pow(triangle.getPointB().getX() - triangle.getPointA().getX(), 2) +
                Math.pow(triangle.getPointB().getY() - triangle.getPointA().getY(), 2));

        triangle.setSideA(sideA);
        triangle.setSideB(sideB);
        triangle.setSideC(sideC);

        ViewHelper.view(TriangleLogic.perimeter(triangle));
        ViewHelper.viewPoint(TriangleLogic.medianaIntersectionPoint(triangle.getPointA(), triangle.getPointB(), triangle.getPointC()));
        ViewHelper.view(TriangleLogic.squareByTreeSide(triangle));
    }
}
