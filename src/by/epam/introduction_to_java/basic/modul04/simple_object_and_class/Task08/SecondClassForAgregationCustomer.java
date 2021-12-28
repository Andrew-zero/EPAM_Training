package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.util.concurrent.atomic.AtomicInteger;

/*
Создать второй класс,  агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 */
public class SecondClassForAgregationCustomer {
    public static volatile AtomicInteger id = new AtomicInteger(0);
    private Customer[] customer;

    public SecondClassForAgregationCustomer(){}

    public SecondClassForAgregationCustomer(Customer[] customer) {
        this.customer = customer;
    }

}
