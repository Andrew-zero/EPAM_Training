package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
6.	Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 */
public class Task06 {

    static int a = 1;
    static int b = 3;
    static int c = 4;


    public static boolean relativePrime(int a, int b, int c) {
        boolean result = gcd(gcd(a, b), c) == 1;

        ViewHelper.helpViewResult(result);

        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
