package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Сортировка выбором.
Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить элементы так,
что бы они были расположены по убыванию. Для этого в массива, начиная с первого, выбирается наибольший элемент
и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
 */
public class Task03 {

    static double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static double[] sortByChoiceArray(double[] array){
        for(int i = 0; i < array.length; i++){
            for(int k = i; k < array.length; k++){
                if(array[i] < array[k]){
                    double temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }

        ViewHelper.helpViewArray(array);

        return array;
    }
}
