package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


/*
Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше последнего.
Если считать столбцы от '0', то используем условие if(i%2 != 0), если счёт столбца от '1', то if(i%2 == 0);
В данном решении, мы используем счёт столбцов от '0'.
 */
public class Task01 {

    static int[][] testArray = {{0, 2, 2, 4, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5},
                                {0, 1, 2, 3, 4, 5}};

    public static void viewOddColumnMatrix(int[][] array) {
        if(array.length == 0)
            throw new NumberFormatException();

            for (int j = 0; j < array[0].length; j++) {
                if (j % 2 != 0) {
                    if (array[0][j] > array[array.length - 1][j]) {
                        for (int k = 0; k < array.length; k++) {
                            System.out.println(array[k][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
    }

}
