package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */
public class Task12 {

    static double[][] testArray = {{0, -8, 7, 4, 4, 5},
                                   {0, 1, 2, 3, 4, 5},
                                   {1, 1, -2, 3, 4, 5},
                                   {0, 1, 2, -3, 5, 4},
                                   {9, 1, 2, 2, 4, 5},
                                   {0, 1, 2, 3, 4, -5}};

    public static void sortRowMatrix(double[][] array){
        if(array.length == 0)
            throw new NumberFormatException();

        double temp;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length - 1; j++){
                for(int k = j+1; k < array[i].length; k++){
                    if(array[i][j] > array[i][k]) {
                        temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }

        //View Matrix after first sort
        ViewHelper.helpViewArray(array);

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length - 1; j++){
                for(int k = j+1; k < array[i].length; k++){
                    if(array[i][j] < array[i][k]) {
                        temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }

        //View Matrix after second sort
        System.out.println();
        ViewHelper.helpViewArray(array);
    }
}
