package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;


import java.util.Random;

/*
Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нём отрицательных, положительных и нулевых элементов.
 */
public class Task03 {

    static int countOne;
    static int countTwo;
    static int countThree;
    
    static Random random = new Random();
    static double[] d = random.doubles(2000, -1000, 1000)
            .toArray();
    static double[] d1 = {-2, -4, 0, 5, 0, 0, -8, 3};

    public static void countElement(double[] d){
    for(Double d1 : d){
        if(d1 < 0)
            countOne++;
        else if(d1 > 0)
            countTwo++;
        else
            countThree++;
    }
        System.out.println("Отрицательных элементов: " + countOne);
        System.out.println("Положительных элементов: " + countTwo);
        System.out.println("Нулевых элементов: " + countThree);
    }

}
