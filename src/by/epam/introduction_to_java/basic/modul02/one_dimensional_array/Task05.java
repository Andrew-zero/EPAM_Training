package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;



/*
Даны целые числа а1, а2, ..., аn. Вывести на печать только те числа для которых аi > i
 */
public class Task05 {

    static double[] d = {-5, -7, 0, 2, 3.7, 9, -0.0};

    public static void findNumber(double[] d){
        System.out.println();
        for(int i=0; i < d.length; i++){
            if(d[i] > i)
            System.out.print(d[i]);
        }
    }
}
