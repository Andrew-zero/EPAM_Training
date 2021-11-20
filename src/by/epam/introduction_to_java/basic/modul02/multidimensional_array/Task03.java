package by.epam.introduction_to_java.basic.modul02.multidimensional_array;



/*
Дана матрица. Вывести k-ю строку и р-й столбец матрицы.
 */
public class Task03 {

    static int[][] testArray = {{0, 2, 2, 4, 4, 5},
            {0, 1, 2, 3, 4, 5},
            {1, 1, 2, 3, 4, 5},
            {0, 1, 2, 3, 4, 5},
            {0, 1, 2, 3, 4, 5},
            {0, 1, 2, 3, 4, 5}};

    public static void viewCustomLineMatrix(int[][] array, int kString, int pColumn){
        if(array.length == 0 || kString < 0 || pColumn < 0)
            throw new NumberFormatException();


        System.out.println("Выводим строку матрицы: ");
        for(int j = 0; j < array[kString].length; j++){
            System.out.print(array[kString][j] + " ");
        }
        System.out.println("\nВыводим столбец матрицы: ");
        for (int[] ints : array) {
            System.out.print(ints[pColumn] + " ");
        }
    }
}
