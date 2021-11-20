package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Сформировать квадратную матрицу порядка N по правилу:
А[I,J] = sin ((pow(I,2) - pow(J,2)) / N),
и подсчитать количество положительных элементов в ней.
 */
public class Task07 {


    public static double[][] viewCreateMatrix(int n) {
        if (n < 1) {
            throw new NumberFormatException();
        }

        double[][] resultMatrix = new double[n][n];
        int count = 0;

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if(resultMatrix[i][j] > 0)
                    count++;
            }
        }

        //View Matrix
        ViewHelper.helpViewArray(resultMatrix);
        System.out.printf("Количество положительных элементов: %d\n", count);

        return resultMatrix;
    }
}
