package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
14.	Натуральное число, в записи которого n цифр, называется числом Армстронга,
если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class Task14 {


    public static void armstrongNumber(int k){
        for(int i = 1; i < k; i++){
            if(isArmstrongNumber(i)){
                ViewHelper.helpView(String.format("Является числом Армстронга %d", i));
            }
        }
    }

    public static boolean isArmstrongNumber(int number){
        int power = getLengthNumber(number);
        boolean result;

        result = number == numberInPower(number, power);

        return result;
        // return number == numberInPower(number, power);
    }

    public static int numberInPower(int number, int power) {
        int result = 0;

        while (number >= 1) {
            int digit = number % 10;
            number /= 10;
            result += Math.pow(digit, power);
        }

        return result;
    }

    public static int getLengthNumber(int k) {

        return ("" + k).length();
    }

}
