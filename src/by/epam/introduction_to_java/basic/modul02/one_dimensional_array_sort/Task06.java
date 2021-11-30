package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и аi+1. Если аi <= ai+1,
то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class Task06 {

    static double[] array = {-3, 5, 7, 0, 5, -6, 7, 8, 0};

    public static double[] sortByShell(double[] array) {
        int d = array.length >> 1;

        while (d > 0) {
            for (int i = 0; i < (array.length - d); i++) {
                int j = i;
                while ((j >= 0) && array[j] > array[j + d]) {
                    double temp = array[j];
                    array[j] = array[j + d];
                    array[j + d] = temp;
                    j--;
                }
            }
            d = d >> 1;
        }

        ViewHelper.helPViewArray(array);

        return array;
    }
}