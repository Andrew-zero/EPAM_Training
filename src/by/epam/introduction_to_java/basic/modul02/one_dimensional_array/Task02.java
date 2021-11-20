package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;


import java.util.Arrays;

/*
Дана последовательность действительных чисел a1, a2, ..., an.
Заменить все её члены, большие данного Z, этим числом.
Подсчитать количество замен.
 */
public class Task02 {

    static double[] d1 = {1,2,3,15,5,67,8,9,12};
    static double z = 5;
    static int count = 0;

    public static double[] processing(double[] d, double z){
        double[] result = Arrays.stream(d)
                .map(s -> s > z ? s = z : s)
                .toArray();
        count = (int) Arrays.stream(d)
                .filter(s -> s>z)
                .count();

        System.out.printf("Количество замен = %d\n", count);

        return result;
    }
}
