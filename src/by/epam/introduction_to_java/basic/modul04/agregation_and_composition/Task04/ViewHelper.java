package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task04;

public class ViewHelper {

    public static void viewResult(Count count){
        System.out.println(count.toString());
    }

    public static void viewResult(Count[] counts){
        for (Count c : counts){
            System.out.println(c.toString());
        }
    }

    public static void viewResult(double d){
        System.out.println("Запрашиваемая сумма равна: " + d);
    }

    public static void viewResult(int i){
        System.out.println();
    }
}
