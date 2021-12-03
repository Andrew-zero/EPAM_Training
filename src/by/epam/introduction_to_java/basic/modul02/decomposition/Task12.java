package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
12.	Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task12 {

    static int k = 54;
    static int n = 1351384;

    public static int[] createArray(int k, int n) {
        int length = countEqualNumber(k, n);
        int[] resultArray = new int[length];

        for(int i = 0, j = 0; i < n; i++){
            if(sumNumbers(i) == k){
                resultArray[j] = i;
                j++;
            }
        }

        ViewHelper.helpViewArray(resultArray);

        return resultArray;
    }

    public static int countEqualNumber(int k, int n) {
        int count = 0;

        for(int i = 0; i < n; i++){
            if(sumNumbers(i) == k){
                count++;
            }
        }

        return count;
    }

    public static int sumNumbers(int x) {
        int result = 0;

        while (x > 0) {
            result += x % 10;
            x /= 10;
        }

        return result;
    }
}
