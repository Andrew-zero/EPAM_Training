package by.epam.introduction_to_java.basic.modul05.Task02;


/*
Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 */
public class Main {


    public static void main(String[] args) {
        Payment payment = new Payment();
        LogicPayment logicPayment = new LogicPayment();
        ViewPayment viewPayment = new ViewPayment();
        double total;

        payment.getProductsList().add(new Payment.Product("Sugar", 1.55));
        payment.getProductsList().add(new Payment.Product("Sugar", 1.55));
        payment.getProductsList().add(new Payment.Product("Sugar", 1.55));

        total = logicPayment.totalCount(payment.getProductsList());

        viewPayment.print(payment);
        viewPayment.printTotal(total);
    }


}
