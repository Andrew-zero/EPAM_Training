package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Даны дроби p1/q1, p2/q2,...,pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби
к общему знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task08 {

    public static void processAndSort() {
        int n = 0;
        int[] p = null;
        int[] q = null;
        int denominator = 1;

        String message = "Введите натуральное число: ";
        String message2 = "Введите натуральное число числителя: ";
        String message3 = "Введите натуральное число знаменателя: ";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(message);
            n = Integer.parseInt(br.readLine());
            while (n <= 0) {
                System.out.println(message);
                n = Integer.parseInt(br.readLine());
            }

            p = new int[n];
            q = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println(message2);
                p[i] = Integer.parseInt(br.readLine());

                while (p[i] <= 0) {
                    System.out.println(message2);
                    p[i] = Integer.parseInt(br.readLine());
                }

                System.out.println(message3);
                q[i] = Integer.parseInt(br.readLine());

                while (q[i] <= 0) {
                    System.out.println(message2);
                    q[i] = Integer.parseInt(br.readLine());
                }

                denominator = lcm(q[i], denominator);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < n; i++) {
            p[i] = p[i] * (denominator / q[i]);
        }

        sortByShell(p);

        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + denominator + " ");
        }
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static int[] sortByShell(int[] array) {
        int d = array.length / 2;

        while (d > 0) {
            for (int i = 0; i < (array.length - d); i++) {
                while (d >= 0 && array[i] > array[i + d]) {
                    int temp = array[i];
                    array[i] = array[i + d];
                    array[i + d] = temp;
                    d--;
                }
            }
            d /= 2;
        }

        return array;
    }

}
