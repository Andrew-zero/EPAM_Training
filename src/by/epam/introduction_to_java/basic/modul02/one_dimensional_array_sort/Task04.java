package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Сортировка обменами.
Дана последовательность чисел a1<=a2<=...<=an.
Требуется переставить числа в порядке возрастания Для этого сравниваются два соседних числа ai и ai+1.
Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы
не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task04 {


    static double[] array = {9, 5, 7, 0, 5, 6, 7, 8, 0};

    public static double[] sortingByExchanged(double[] array) {

        int count = 0;

        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array.length - i);
            for (int k = 0; k < i; k++) {
                System.out.println("!" + (array.length - i - 1));
                if (array[k] > array[k + 1]) {
                    double temp = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = temp;
                    count++;
                }
            }
        }

        ViewHelper.helpViewArray(array);
        System.out.println("Количество перестановок составило: " + count);

        return array;
    }
}
