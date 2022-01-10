package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task04;



/*
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.

Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("TopClient");
        client.addCount(new Count(123456789, false));
        client.addCount(new Count(987654321, false));
        client.addCount(new Count(456987123, false));
        client.addCount(new Count(654987123, false));

//        client.sortCount();
        ViewHelper.viewResult(client.getArrayCounts());

//        ViewHelper.viewResult(client.findCount(456987123));


    }
}
