package by.epam.introduction_to_java.basic.modul02.decomposition;



/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class Task03 {

    public static double hexagonSFromTriangle(double triangleS){
        return triangleS * 6;
    }

    public static double triangleS(int a){
        double p = (a *3)/2;
        return Math.sqrt(p*(p-a)*3);
    }
}
