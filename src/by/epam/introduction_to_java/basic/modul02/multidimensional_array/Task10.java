package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {


    static double[][] testArray = {{0, 2, 2, 4, 4, 5},
                                   {0, 1, 2, 3, 4, 5},
                                   {1, 1, -2, 3, 4, 5},
                                   {0, 1, 2, -3, 4, 5},
                                   {0, 1, 2, 3, 4, 5},
                                   {0, 1, 2, 3, 4, -5}};

    public static void positiveElementMainDiagonal(double[][] array){
        if(array.length == 0){
            throw new NumberFormatException();
        }

        //View positive elements
        for(int i = 0; i < array.length; i++){
            if(array[i][i] > 0)
                System.out.print(array[i][i] + " ");
        }
    }
}
