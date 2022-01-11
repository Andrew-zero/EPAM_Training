package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.main;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.entity.Point;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.entity.Triangle;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.logic.TriangleLogic;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.view.ViewHelper;

public class Main {


    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setPointA(new Point(2, -8));
        triangle.setPointB(new Point(-3, 9));
        triangle.setPointC(new Point(7, -10));

        double sideA = TriangleLogic.getSide(triangle.getPointC(), triangle.getPointB());
        double sideB = TriangleLogic.getSide(triangle.getPointC(), triangle.getPointA());
        double sideC = TriangleLogic.getSide(triangle.getPointA(), triangle.getPointB());

        triangle.setSideA(sideA);
        triangle.setSideB(sideB);
        triangle.setSideC(sideC);

        ViewHelper.view(TriangleLogic.perimeter(triangle));
        ViewHelper.viewPoint(TriangleLogic.medianaIntersectionPoint(triangle.getPointA(), triangle.getPointB(), triangle.getPointC()));
        ViewHelper.view(TriangleLogic.squareByTreeSide(triangle));
    }
}
