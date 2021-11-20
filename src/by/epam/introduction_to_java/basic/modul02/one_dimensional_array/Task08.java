package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;




/*
Дана последовательность целых чисел а1, а2, ...аn. Образовать новую последовательность,
выбросив из исходной те члены, которые равны min(a1, a2, ... an).
 */
public class Task08 {

    public static int[] newSequence(int[] array){
        int min = Integer.MAX_VALUE;
        for (int k : array) {
            if (min > k)
                min = k;
        }
        int count = 0;

        for(int i : array){
            if(i == min)
                count++;
        }

        int[] array2 = new int[array.length-count];
        for(int i = 0, j = 0; i < array.length; i++){
            if(array[i] != min) {
                array2[j] = array[i];
                j++;
            }
        }

        return array2;
    }
}
