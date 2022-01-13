package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08.entity;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08.entity.Customer;

import java.util.ArrayList;
import java.util.Objects;

/*
Создать второй класс,  агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 */
public class CustomerBase {
    private ArrayList<Customer> customers = new ArrayList<>();

    public CustomerBase(){}

    public CustomerBase(ArrayList<Customer> customers) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBase that = (CustomerBase) o;
        return Objects.equals(customers, that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        return "CustomerBase{" +
                "customers=" + customers +
                '}';
    }
}
