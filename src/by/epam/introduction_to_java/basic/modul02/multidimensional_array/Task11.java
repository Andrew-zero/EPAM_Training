package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

import java.util.Random;

/*
Матрицу 10х20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */
public class Task11 {

    public static void viewMatrix() {
        int rowNumber = 10;
        int columnNumber = 20;
        int[][] resultMatrix = new int[rowNumber][columnNumber];
        boolean[] stringWithNumber5 = new boolean[rowNumber];

        int count = 0;

        Random random = new Random();

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = random.nextInt(15);
                if (resultMatrix[i][j] == 5)
                    count++;
            }
            if (count >= 3) {
                stringWithNumber5[i] = true;
            }
            count = 0;
        }

        //View Matrix
        ViewHelper.helpViewArray(resultMatrix);

        for(int i = 0; i < stringWithNumber5.length; i++){
            if(stringWithNumber5[i])
                System.out.printf("В строке %s цифра 5 встречается 3 и более раз.\n", i);
        }
    }
}
