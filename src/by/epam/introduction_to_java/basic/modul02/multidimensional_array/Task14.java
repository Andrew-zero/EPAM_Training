package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */
public class Task14 {


    public static int[][] createRandomMatrix(int rowNumber, int columnNumber) {
        if (rowNumber < 0 || columnNumber < 0)
            throw new NumberFormatException();

        int[][] resultMatrix = new int[rowNumber][columnNumber];

        for (int j = 1; j < resultMatrix[0].length; j++) {
            if (j <= resultMatrix.length) {
                for (int i = 0; i < j; i++) {
                    resultMatrix[i][j] = 1;
                }
            } else {
                for (int i = 0; i < resultMatrix.length; i++) {
                    resultMatrix[i][j] = 1;
                }
            }
        }

        //View Matrix
        ViewHelper.helpViewArray(resultMatrix);

        return resultMatrix;
    }
}
