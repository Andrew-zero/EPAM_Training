package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task08 {

    static double[][] testArray = {{0, 2, 2, 4, 4, 5},
                                   {0, 1, 2, 3, 4, 5},
                                   {1, 1, 2, 3, 4, 5},
                                   {0, 1, 2, 3, 4, 5},
                                   {0, 1, 2, 3, 4, 5},
                                   {0, 1, 2, 3, 4, 5}};

    public static double[][] viewCreateMatrix(double[][] array){
        if(array.length == 0)
            throw new NumberFormatException();

        int columnOne;
        int columnTwo;
        double temp;

        //View Matrix before
        ViewHelper.helpViewArray(array);

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Нумерация столбцов начинается с 0 позиции");
            System.out.println("Введите номер первого столбца: ");
            columnOne= Integer.parseInt(br.readLine());
            while(columnOne < 0){
                System.out.println("Введите номер первого столбца: ");
                columnOne = Integer.parseInt(br.readLine());
            }

            System.out.println("Введите номер второго столбца: ");
            columnTwo= Integer.parseInt(br.readLine());
            while(columnTwo < 0){
                System.out.println("Введите номер второго столбца: ");
                columnTwo = Integer.parseInt(br.readLine());
            }

            for(int i = 0; i < array.length; i++){
                temp = array[i][columnOne];
                array[i][columnOne] = array[i][columnTwo];
                array[i][columnTwo] = temp;
            }
        }catch(IOException e){
            e.getCause();
        }

        //View Matrix after
        ViewHelper.helpViewArray(array);

        return array;
    }
}
