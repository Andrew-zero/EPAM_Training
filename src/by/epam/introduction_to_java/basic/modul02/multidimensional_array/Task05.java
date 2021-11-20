package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное)
 */
public class Task05 {


    public static int[][] viewCreateMatrix(int evenN){
        if(evenN%2 != 0 || evenN < 1){
            throw new NumberFormatException();
        }

        int[][] resultMatrix = new int[evenN][evenN];

        for(int i = 0; i < resultMatrix.length; i++){
            for(int j = 0; j < resultMatrix[i].length - i; j++){
                resultMatrix[i][j] = i + 1;
            }
        }

        for(int i = resultMatrix.length - 1, index = 1; i > 0; i--, index++){
            for(int j = index ; j < resultMatrix[i].length; j++){
                resultMatrix[i][j] = 0;
            }
        }

        //View Matrix
        ViewHelper.helpViewArray(resultMatrix);

        return resultMatrix;
    }
}
