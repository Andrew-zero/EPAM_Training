package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
7.	Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task07 {


    public static int sumFactorialOddNumber(){
        int result = 0;

        for(int i = 1; i < 9; i++){
            if(i%2 != 0){
                result += factorial(i);
            }
        }

        ViewHelper.helpViewResult(result);

        return result;
    }

    public static int factorial(int n) {
        int result = n;

        if (n != 1) {
            result *= factorial(n - 1);
        }

        return result;
    }
}
