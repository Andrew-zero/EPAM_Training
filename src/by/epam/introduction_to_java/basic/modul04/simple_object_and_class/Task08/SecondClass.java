package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/*
Создать второй класс,  агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 */
public class SecondClass {
    private ArrayList<Customer> customers = new ArrayList<>();

    public SecondClass(){}

    public SecondClass(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getAllCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
         customers.remove(customer);
    }
}
