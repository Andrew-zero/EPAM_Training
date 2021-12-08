package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

import javax.swing.text.View;

/*
17.	Из заданного числа вычли сумму его цифр.
Из результата вновь вычли сумму его цифр и т.д. 
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */
public class Task17 {

    public static int countMinusSumOfDigit(int n) {
        int count = 0;

        while (n != 0) {
            n -= sumOfDigit(n);
            count++;
        }

        ViewHelper.helpViewResult(count);

        return count;
    }

    public static int sumOfDigit(int n) {
        int result = 0;

        while (n != 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
