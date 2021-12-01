package by.epam.introduction_to_java.basic.modul02.decomposition;


/*
Написать метод(методы) для находения наибольшего общего делителя и
наименьшего общего кратного двух натуральных чисел: (НОК(А,В) = А*В/НОД(А,В));
 */
public class Task01 {

    public static int a = 4;
    public static int b = 7;

    public static int lcd(int a, int b) {
        if (a <= 0 || b <= 0)
            return 0;

        return a / gcd(a, b) * b;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
