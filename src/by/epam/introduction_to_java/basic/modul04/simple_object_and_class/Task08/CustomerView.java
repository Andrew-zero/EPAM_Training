package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задать критерии выбора данных и вывести эти данные на консоль.
 */
public class CustomerView {
    private CustomerLogic customerLogic;

    public CustomerView() {
    }

    public CustomerView(CustomerLogic customerLogic) {
        this.customerLogic = customerLogic;
    }

    public void setCustomerLogic(CustomerLogic customerLogic) {
        this.customerLogic = customerLogic;
    }

    public void viewResult(ArrayList<Customer> arrayList) {
        arrayList.forEach((customer) -> System.out.println(customer.toString()));
    }

    public ArrayList<Customer> returnResultAction(Options option) {
        ArrayList<Customer> customers;

        switch (option) {
            case ONE -> customers = customerLogic.sortByAlphabet(customerLogic.getAllCustomers());
            case TWO -> {
                System.out.println("Введите диапазон поиска номера кредитной карты >>");
                int fromNumber = inputNumber();
                if (!CustomerLogic.checkValueCreditCard(fromNumber)) {
                    while (!CustomerLogic.checkValueCreditCard(fromNumber)) {
                        fromNumber = inputNumber();
                    }
                }
                int toNumber = inputNumber();
                if (!CustomerLogic.checkValueCreditCard(toNumber)) {
                    while (!CustomerLogic.checkValueCreditCard(toNumber)) {
                        fromNumber = inputNumber();
                    }
                }
                customers = customerLogic.findAllRangeCustomerByCreditCard(customerLogic.getAllCustomers(), fromNumber, toNumber);
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }

        return customers;
    }

    public Options pickOption(int number) {

        if (!(number >= 0 && number < Options.values().length)) {
            throw new IllegalArgumentException("Выбор опции не верен.");
        }

        return Options.values()[number];
    }

    public int inputNumber() {
        int result = 0;
        System.out.println("->");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            result = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.getCause();
        }

        return result;
    }

    public void choseOption() {
        System.out.println("Выберите критерий выбора данных: ");

        for (Options o : Options.values()) {
            System.out.println(o.ordinal() + " - " + o.getDiscribe());
        }
    }

    public static void print(String s) {
        System.out.println();
    }
}
