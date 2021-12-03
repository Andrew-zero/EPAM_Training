package by.epam.introduction_to_java.basic.modul02.ViewHelper;

public class ViewHelper {

    public static void helpViewResult(int n){
        System.out.println(n);
    }

    public static void helpViewResult(double d){
        System.out.println(d);
    }

    public static void helpViewResult(String s){
        System.out.println(s);
    }

    public static void helpViewArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void helpViewArray(double[][] array){
        for (double[] doubles : array) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
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
