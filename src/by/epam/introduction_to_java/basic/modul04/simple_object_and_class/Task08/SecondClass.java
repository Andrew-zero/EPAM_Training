package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/*
Создать второй класс,  агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 */
public class SecondClass {
    private static volatile AtomicInteger id = new AtomicInteger(0);
    private ArrayList<Customer> customers;

    public SecondClass(){}

    public SecondClass(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public static AtomicInteger getId() {
        return id;
    }
}