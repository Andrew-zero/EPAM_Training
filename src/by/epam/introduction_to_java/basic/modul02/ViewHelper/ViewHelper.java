package by.epam.introduction_to_java.basic.modul02.ViewHelper;

public class ViewHelper {

    public static void helpViewArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void helpViewArray(double[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void helPViewArray(double[] array){
        for (double d : array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void helPViewArray(int[] array){
        for (double d : array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
