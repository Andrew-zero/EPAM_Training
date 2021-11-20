package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;


import java.util.Arrays;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {

    public static int[] arrayTest = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static int[] compressEvenArray(int[] array) {
        if (array.length == 0)
            throw new NumberFormatException();
        if (array.length == 1)
            return array;

        int index = 1;
        for (int i = 2; i < array.length; i += 2) {
            array[index] = array[i];
            index++;
        }

        if (array.length % 2 == 0) {
            return Arrays.copyOf(array, array.length / 2);
        }

        return Arrays.copyOf(array, array.length / 2 + 1);
    }
}
