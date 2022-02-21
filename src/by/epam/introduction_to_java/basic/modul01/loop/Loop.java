package by.epam.introduction_to_java.basic.modul01.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Loop {

    /*
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введённого пользователем числа.
     */
    public static void firstLoop() {
        long res = 0;
        int number = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (number <= 0) {
                number = Integer.parseInt(br.readLine());
            }
            for (int i = 1; i < number; i++) {
                res += i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(res);
    }

    /*
    Вычислить значения функции на отрезке [а, b] с шагом h:
    y = x, x>2
    y = -x, x<=2
     */
    public static void secondLoop() {
        double a, b, h, y;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите левую границу интервала");
            a = Double.parseDouble(br.readLine());
            System.out.println("Введите правую границу интервала");
            b = Double.parseDouble(br.readLine());
            System.out.println("Введите шаг");
            h = Double.parseDouble(br.readLine());

            for (double i = a; i <= b; i += h) {
                if (i > 2) {
                    y = i;
                    System.out.println(y);
                }
                if (i <= 2) {
                    y = -i;
                    System.out.println(y);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Найти сумму квадратов первых ста чисел.
     */
    public static long thirdLoop(int n) {
        long res = (long) Math.pow(n, 2);
        if (n < 100) {
            res += thirdLoop(++n);
        }
        return res;
    }

    /*
    Составить программу нахождения произведения квадратов первых двухсот чисел.
    */

//    Для корректного решения поставленной задачи необходимо использовать
//    встроенный, в Java библиотеку math, класс BigInteger.
//    В противном случае при использовании примитивных чисел произойдёт переполнение переменной и данные будут не корректны.

    public static BigInteger fourthLoop(int n) {
        int k = (int) Math.pow(n, 2);
        BigInteger res = new BigInteger(String.valueOf(k));
        if (n < 200) {
            res = res.multiply(fourthLoop(++n));
        }
        return res;
    }

    public static long fourthLoop2() {
        long result = 1;
        int count = 0;

        for(int i = 1; i <= 200; i ++){
            if(result > 0) {
                result *= (long) Math.pow(i, 2);
                count++;
            }else{
                System.out.println("Произошло переполнение");
                System.out.println("На " + count + " итерации произошел выход за пределы хранимых данных типа long.");
                return -1;
            }
        }

        return result;
    }

    //с прерыванием в цикле

    /*
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид:
    An = 1/pow(2, n) + 1/pow(3, n);
     */
    public static void fifthLoop() {
        double result = 0;
        double e;
        double temp;
        int n = 1;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число e");
            e = Double.parseDouble(br.readLine());

            while (true) {
                temp = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
                if (temp >= e) {
                    result += temp;
                    n++;
                } else {
                    break;
                }
            }
        } catch (IOException exc) {
            exc.getCause();
        }
        System.out.println(result);
    }

    /*
    Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера.
     */
    public static void sixthLoop() {
        for (int i = ' '; i <= '~'; i++) {
            System.out.printf("'%s' ", (char) i);
            if (i % 14 == 3)
                System.out.println();
        }
    }

    /*
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
     */
    public static void seventhLoop() {
        int m;
        int n;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите натуральное число: ");
            m = Integer.parseInt(br.readLine());
            System.out.println("Введите второе натуральное число: ");
            n = Integer.parseInt(br.readLine());

            if (m <= 0 || n <= 0 || m > n) {
                System.out.println("Были введены некорректные данные.");
                System.out.println("Введите натуральное число: ");
                m = Integer.parseInt(br.readLine());
                System.out.println("Введите второе натуральное число: ");
                n = Integer.parseInt(br.readLine());
            }

            for (int i = m; i < n; i++) {
                System.out.printf("Делители %d: ", i);
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0)
                        System.out.printf("%d ", j);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.getCause();
        }
    }

    /*
    Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */
    public static void eighthLoop() {
        double m;
        double n;
        Set<Character> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите натуральное число: ");
            m = Double.parseDouble(br.readLine());
            System.out.println("Введите второе натуральное число: ");
            n = Double.parseDouble(br.readLine());

            char[] c = String.valueOf(m).toCharArray();
            char[] c2 = String.valueOf(n).toCharArray();

            for (char value1 : c) {
                for (char value2 : c2) {
                    if (value1 == value2)
                        set.add(value1);
                }
            }
            Stream.of(set).forEach(System.out::println);
        } catch (IOException e) {
            e.getCause();
        }
    }
}
