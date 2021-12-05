package by.epam.introduction_to_java.basic.modul02.decomposition;


import java.util.Arrays;

/*
13.	Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */
public class Task13 {








    public static void findTwins(int[] array, int n){
        int simpleNumber1 = 0;
        int simpleNumber2 = 0;
        boolean[] simpleNumber = findSimpleNumber(array);

        for(int i = n; i <= 2*n; i++){

        }
    }


    public static boolean[] findSimpleNumber(int[] array){
        boolean[] simpleNumber = new boolean[array.length];

        Arrays.fill(simpleNumber, true);
        simpleNumber[0] = false;
        simpleNumber[1] = false;

        for(int i = 2; i < array.length; i++){
            if(simpleNumber[i]){
                for(int j = 2; j*i < array.length; j++){
                    simpleNumber[i*j] = false;
                }
            }
        }

        return simpleNumber;
    }
}
