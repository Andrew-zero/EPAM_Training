package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
 */
public class Task04 {

    public static int[][] createMatrix(int evenN){
        if(evenN%2 != 0 || evenN < 1){
            throw new NumberFormatException();
        }

        int[][] resultMatrix = new int[evenN][evenN];

        for(int i = 0; i < resultMatrix.length; i++){
            if(i%2 == 0){
                for(int j = 0; j < resultMatrix[i].length; j++){
                    resultMatrix[i][j] = j + 1;
                }
            }else{
                for(int j = 0; j < resultMatrix[i].length; j++){
                    resultMatrix[i][j] = evenN - j;
                }
            }
        }

        //View Matrix
        ViewHelper.helpViewArray(resultMatrix);

        return resultMatrix;
    }
}
