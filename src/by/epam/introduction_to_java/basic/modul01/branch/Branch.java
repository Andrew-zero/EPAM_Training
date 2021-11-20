package by.epam.introduction_to_java.basic.modul01.branch;

public class Branch {

    /*
    Даны два угла треугольника (в градусах).
    Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
     */
    public static void branchOne(double degree, double degree2) {
        String result = null;

        if (degree > 0 && degree2 > 0) {
            result = (degree + degree2) < 180 ?
                    (degree == 90 || degree2 == 90 || (180 - degree - degree2) == 90) ?
                            "Треугольник существует и он прямоугольный" : "Треугольник существует" :
                    "Такого треугольника не существует";
        }

        System.out.println(result);
    }

    /*
    Найти max{min(a,b), min(c,d)}.
     */
    public static void branchTwo(int a, int b, int c, int d) {

        int result = Math.max(Math.min(a, b), Math.min(c, d));

        System.out.println(result);
    }

    /*
    Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить будут ли они расположены на одной прямой.
     */
    public static void branchThree(int x1, int y1, int x2, int y2, int x3, int y3) {
        String result;

        result = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1) ?
                "Данные три точки принадлежат одной прямой." : "Данные три точки не принадлежат одной прямой.";

        System.out.println(result);
    }

    /*
    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    Определить, пройдет ли кирпич через отверстие.
     */
    public static void branchFour(int a, int b, int xBrick, int yBrick, int zBrick) {
        if (a > 0 && b > 0 && xBrick > 0 && yBrick > 0 && zBrick > 0) {
            if (xBrick < a && yBrick < b || xBrick < b && yBrick < a ||
                    xBrick < a && zBrick < b || xBrick < b && zBrick < a ||
                    yBrick < a && zBrick < b || yBrick < b && zBrick < a) {
                System.out.println("Кирпич пройдёт через отверстие.");
            } else {
                System.out.println("Кирпич не пройдёт через отверстие.");
            }
        } else {
            System.out.println("Введены не корректные размеры");
        }
    }

    /*
    Вычислить значение функции:
    F(x) = pow(x,2) - 3x +9, если х<=3;
    F(x) = 1/(pow(x, 3) + 6), если х >3;
     */
    public static void branchFive(int x) {
        double result;

        result = x <= 3 ? Math.pow(x, 2) - 3 * x + 9 :
                     1 / (Math.pow(x, 3) + 6);

        System.out.printf("Результат = %.2f", result);
    }

}
