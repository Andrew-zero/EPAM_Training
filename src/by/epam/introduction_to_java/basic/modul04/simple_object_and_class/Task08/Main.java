package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int number;
        ArrayList<Customer> list;

        SecondClass secondClass = new SecondClass();
        CustomerLogic customerLogic = new CustomerLogic(secondClass);
        CustomerView customerView = new CustomerView(customerLogic);

        customerLogic.initializationCustomer();

        customerView.choseOption();
        number = customerView.inputNumber();

        list = customerView.returnResultAction(customerView.pickOption(number));
        customerView.viewResult(list);
    }
}
