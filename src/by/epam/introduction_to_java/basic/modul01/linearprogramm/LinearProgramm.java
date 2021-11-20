package by.epam.introduction_to_java.basic.modul01.linearprogramm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearProgramm {

    /*
    Найдите значение функции: z = ((a-3)*b/2)+c.
     */
    public static void firstFunctions() {
        double a = 0;
        double b = 0;
        double c = 0;
        double z;
        String s;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("Введите первый аргумент: ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    a = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+"));

            do {
                System.out.println("Введите второй аргумент не равный \"0\": ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    b = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+") || b == 0);

            do {
                System.out.println("Введите третий аргумент: ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    c = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+"));

        } catch (IOException e) {
            e.getCause();
        }

        z = ((a - 3) * b / 2) + c;

        System.out.printf("Значение функции равно: %.2f\n", z);
    }

    /*
    Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    b+sqrt(pow(b,2) + 4ac)/2a - pow(a,3)c + pow(b,-2)
     */
    public static void secondFunctions() {
        double a = 0;
        double b = 0;
        double c = 0;
        double z;
        String s;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("Введите первый аргумент: ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    a = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+"));

            do {
                System.out.println("Введите второй аргумент: ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    b = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+"));

            do {
                System.out.println("Введите третий аргумент: ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    c = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+"));

        } catch (IOException e) {
            e.getCause();
        }

        z = (b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a - Math.pow(a, 3) * c + Math.pow(b, -2));

        System.out.printf("Значение функции равно: %.2f\n", z);
    }

    /*
    Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    sin(x) + cos(y) / cos(x) - sin(y) * tg(xy)
     */
    public static void thirdFunctions() {
        double x = 0;
        double y = 0;
        double z;
        String s;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("Введите первый аргумент: ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    x = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+"));

            do {
                System.out.println("Введите второй аргумент: ");
                s = br.readLine();
                if (s.equals("\\d+\\.?\\d+")) {
                    y = Double.parseDouble(s);
                }
            } while (!s.equals("\\d+\\.?\\d+"));

        } catch (IOException e) {
            e.getCause();
        }

        z = (Math.sin(x) + Math.sin(y)) / ((Math.cos(x) - Math.sin(y)) - Math.tan(x * y));

        System.out.printf("Значение функции равно: %.2f\n", z);
    }

    /*
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
     */
    public static void fourthFunctions(double d) {
        // number R kind of nnn.ddd;
        String s = String.valueOf(d);

        String s1 = s.substring(4, 7) +
                s.charAt(3) +
                s.substring(0, 3);

        System.out.println(s1);
    }

    /*
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.
     */
    public static void fifthFunctions(int t) {
        // HHч ММмин SSc
        int hour;
        int min;
        int sec;
        hour = t / 3600;
        min = t % 3600 / 60;
        sec = t % 3600 % 60;

        System.out.printf("%dч %dмин %dс\n", hour, min, sec);
    }

    /*
    Для данной области составить линейную программу, которая печатает true,
    если точка с координатами (х,у) принадлежит закрашенной области и false - в противном случае
     */
    public static void sixthFunctions(double x, double y) {
        boolean result;

        result = (x > -4 && x < 4 && y > -2 && y < 1)
                || (x > -2 && x < 2 && y < 5 && y > -2);

        System.out.println(result);
    }
}
