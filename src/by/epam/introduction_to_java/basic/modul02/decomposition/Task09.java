package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
9.	Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class Task09 {

    static double x = 2;
    static double y = 2;
    static double z = 5;
    static double t = 4;

    public static double tetragonS(double x, double y, double z, double t) {
        double p;
        double resultS;

        p = halfP(x, y, z, t);
        resultS = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));

        ViewHelper.helpViewResult(p);
        ViewHelper.helpViewResult(resultS);

        return resultS;
    }

    public static double halfP(double x, double y, double z, double t) {

        return (x + y + z + t) / 2;
    }
}
