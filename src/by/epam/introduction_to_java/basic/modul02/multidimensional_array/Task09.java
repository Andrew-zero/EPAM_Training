package by.epam.introduction_to_java.basic.modul02.multidimensional_array;




/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */
public class Task09 {

    static double[][] testArray = {{0, 2, 2, 4, 4, 5},
            {0, 1, 2, 3, 4, 5},
            {1, 1, 2, 3, 4, 5},
            {0, 1, 2, 3, 4, 5},
            {0, 1, 2, 3, 4, 5},
            {0, 1, 2, 3, 4, 5}};

    public static void sumMatrixElement(double[][] array){
        if(array.length == 0)
            throw new NumberFormatException();

        int numberColumn = array[0].length;
        double[] listColumn = new double[numberColumn];
        double maxSum = 0;

        for(int j = 0; j < numberColumn; j++){
            for (double[] doubles : array) {
                listColumn[j] += doubles[j];
            }
        }

        for(double d : listColumn){
            if(maxSum < d)
                maxSum = d;
        }

        //View sum column
        for(double d : listColumn){
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.printf("max sum = %.2f", maxSum);
    }
}
