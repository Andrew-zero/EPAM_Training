package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


/*
Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
Примечание. Дополнительный массив не использовать.
 */
public class Task02 {

    static double[] array = {1, 2, 3, 4, 5};
    static double[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void newChain(double[] array, double[] array2) {
        int i = 0;
        int j = 0;
        double d1 = array[i];
        double d2 = array2[j];
        int capacity = array.length + array2.length;

        while (capacity > 0) {
            if (d1 < d2) {
                System.out.print(d1 + " ");
                if (i < array.length - 1) {
                    i++;
                    d1 = array[i];
                } else {
                    d1 = Integer.MAX_VALUE;
                }
            } else {
                System.out.print(d2 + " ");
                if (j < array2.length - 1) {
                    j++;
                    d2 = array2[j];
                } else {
                    d2 = Integer.MAX_VALUE;
                }
            }

            capacity--;
        }
    }

}
