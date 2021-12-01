package by.epam.introduction_to_java.basic.modul02.decomposition;


/*
Написать метод(методы) для нахождения наибольшего общего делителя четырёх натуральных чисел.
 */
public class Task02 {

    public static int a = 4;
    public static int b = 7;
    public static int c = 11;
    public static int d = 5;


    public static int quadGcd(int a, int b, int c, int d){
        return gcd(gcd(a,b),gcd(b,c));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);

        return gcd(b, a % b);
    }
}
