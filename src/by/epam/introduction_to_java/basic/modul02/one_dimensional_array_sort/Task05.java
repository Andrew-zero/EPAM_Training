package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


import java.util.Arrays;

/*
Сортировка вставками. Дана последовательность чисел a1, a1, ... an. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1,a1,...,an - упорядоченная последовательность, т.е.
a1<=a2<=...<=an. Берется следующее число ai+1 и вставляется в последовательность так, что бы новая последовательность
была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 До n не будут перебраны.
Примечание Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
Двоичный поиск оформить в виде отдельной функции.
 */
public class Task05 {

    static double[] array = {9, 5, 7, 0, 5, 6, 7, 8, 0};

    public static double[] sortByInserts(double[] array) {


        return array;
    }

    public static int binarySearch(double[] array, int fromIndex, int toIndex, double k) {
        if(toIndex < fromIndex)
            return -1;

        int mid = (fromIndex + toIndex - 1) >>> 1;


        double midNumbar = array[mid];


        return -1;
    }

}
