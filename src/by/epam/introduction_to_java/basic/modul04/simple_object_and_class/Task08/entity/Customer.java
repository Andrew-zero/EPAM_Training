package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08.entity;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08.logic.CustomerLogic;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08.view.CustomerView;

import java.util.concurrent.atomic.AtomicInteger;

/*
Создать класс Customer, спецификация которого приведена ниже.

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счёта.//
Определить конструкторы, set- и get- методы и метод toString().//

Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.

Задать критерии выбора данных и вывести эти данные на консоль.

Найти и вывести:
а) список покупателей в алфавитном порядке;
б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */
public class Customer {
    private final int id;
    private static final AtomicInteger count = new AtomicInteger(0);

    private int bankAccountNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private Address address;
    private int creditCardNumber;

    public Customer() {
        this.id = count.getAndIncrement();
    }

    public Customer(int bankAccountNumber) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(int bankAccountNumber, String lastName) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
    }

    public Customer(int bankAccountNumber, String lastName, String firstName) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Customer(String lastName, String firstName, String middleName) {
        this.id = count.getAndIncrement();
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Customer(int bankAccountNumber, String lastName, Address address) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.address = address;
    }

    public Customer(int bankAccountNumber, String lastName, Address address, int creditCardNumber) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
    }

    public Customer(int bankAccountNumber, String lastName, String firstName, String middleName) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Customer(int bankAccountNumber, String lastName, String firstName, String middleName, Address address) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
    }

    public Customer(int bankAccountNumber, String lastName, String firstName, String middleName, int creditCardNumber) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.creditCardNumber = creditCardNumber;
    }

    public Customer(int bankAccountNumber, String lastName, String firstName, String middleName, Address address, int creditCardNumber) {
        this.id = count.getAndIncrement();
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
    }


    public int getId() {
        return id;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Address getAddress() {
        return address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        if (CustomerLogic.checkBankAccountValue(bankAccountNumber)) {
            this.bankAccountNumber = bankAccountNumber;
        } else {
            CustomerView.print("Введен не верный банковский счёт");
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        if (CustomerLogic.checkValueCreditCard(creditCardNumber)) {
            this.creditCardNumber = creditCardNumber;
        } else {
            CustomerView.print("Введен не верный банковский счёт");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", bankAccountNumber=" + bankAccountNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address=" + address +
                ", creditCardNumber=" + creditCardNumber +
                '}';
    }
}
