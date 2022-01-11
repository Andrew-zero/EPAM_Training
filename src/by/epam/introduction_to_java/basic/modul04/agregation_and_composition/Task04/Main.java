package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task04;



/*
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.

Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("TopClient");

        client.addCount(new Count(12349.00, false));
        client.addCount(new Count(9876.00, false));
        client.addCount(new Count(4567123.00, false));
        client.addCount(new Count(653.00, false));
        ViewHelper.viewResult(client.getArrayCounts());

        client.removeCount(2);
        System.out.println();
        ViewHelper.viewResult(client.getArrayCounts());
        System.out.println();

        client.sortCount();
        ViewHelper.viewResult(client.getArrayCounts());
        System.out.println();

        ViewHelper.viewResult(client.findCount(3));
        System.out.println();

        ViewHelper.viewResult(client.totalSum());
        ViewHelper.viewResult(client.positiveSum());
        ViewHelper.viewResult(client.negativeSum());





//        ViewHelper.viewResult(client.findCount(456987123));


    }
}
