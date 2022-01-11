package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.view;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.entity.Point;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task07.entity.Triangle;

public class ViewHelper {

    public static void view(String s){
        System.out.println(s);
    }

    public static void view(double d){
        System.out.printf("%.2f\n", d);
    }

    public static void viewPoint(Point p){
        String message = "Координаты точки: x = %.2f, y = %.2f\n";

        System.out.printf(message, p.getX(), p.getY());
    }

    public static void viewTriangle(Triangle triangle){
        System.out.println(triangle.toString());
    }
}
