package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task02 {

    static int[][] testArray = {{0, 2, 2, 4, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5}};

    public static void viewDiagonalMatrix(int[][] array) {
        if(array.length == 0)
            throw new NumberFormatException();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][i] + " ");
        }
    }
}
