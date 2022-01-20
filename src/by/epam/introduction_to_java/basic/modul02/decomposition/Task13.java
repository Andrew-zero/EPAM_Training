package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
13.	Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */
public class Task13 {

    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

    public static void findTwins(int[] array, int n) {
        int simpleNumber1 = 0;
        int simpleNumber2 = 0;
        boolean isWrite1 = false;
        boolean isWrite2 = false;

        for (int i = n; i <= 2 * n; i++) {
            if (isSimpleNumber(array[i]) && !isWrite1) {
                simpleNumber1 = array[i];
                isWrite1 = true;
            }

            if (isSimpleNumber(array[i]) && !isWrite2) {
                simpleNumber2 = array[i];
                isWrite2 = true;
            }

            if (isWrite1 && isWrite2) {
                if (simpleNumber2 - simpleNumber1 == 2) {
                    ViewHelper.helpView("Two simple twins: " + simpleNumber1 + " " + simpleNumber2);
                }
                simpleNumber1 = simpleNumber2;
                isWrite2 = false;
            }
        }
    }


    public static boolean isSimpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
                }
            }

        return true;
    }
}
