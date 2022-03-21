package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;

import java.util.Arrays;
import java.util.Random;

/*
В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task01 {

    public static int taskOne() {
        int n = 1000;
        int k = 3;

        Random rand = new Random();
        int[] array = rand.ints(n, 0, 1000).toArray();
//        int sum = Arrays.stream(array)
//                .filter(s -> s%k == 0)
//                .sum();

        int sum = 0;

        for (int i : array) {
            if (i % k == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        return sum;
    }

}
