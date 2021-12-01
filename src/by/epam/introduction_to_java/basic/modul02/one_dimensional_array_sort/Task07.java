package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


/*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и и b1<=b2<=...<=bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую
последовательность так, что бы новая последовательность оставалась возрастающей.
 */
public class Task07 {

    static double[] array = {-6, -3, 0, 0, 5, 5, 7, 7, 8};
    static double[] array2 = {-3, -2, 0, 4, 5, 8, 9, 9, 21};

    public static void sorted2Array(double[] array, double[] array2) {
        int i = 0;
        int j = 0;
        int barrier = array.length + array2.length;

        for (int k = 0; k < barrier; k++) {

            if (checkIndex(i) || checkIndex(j)) {
                if(checkIndex(i)){
                    printPosition(j, k, barrier);
                }
                break;
            }

            if (array[i] > array2[j]) {
                System.out.printf("array2[%.2f] insert position: %d \n", array2[j], k);
                j++;
            } else {
//                System.out.printf("array[%.2f] insert position: %d \n", array[i], k);
                i++;
            }
        }
    }

    public static boolean checkIndex(int index) {

        return index == array.length;
    }

    public static void printPosition(int index, int k1, int barrier1) {
        while (k1 < barrier1) {
            System.out.printf("array2[%.2f] insert position: %d \n", array2[index], k1);
            index++;
            k1++;
        }
    }

}
