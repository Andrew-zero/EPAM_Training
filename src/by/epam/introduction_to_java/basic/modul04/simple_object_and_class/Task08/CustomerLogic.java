package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.util.ArrayList;

/*
Найти и вывести:
а) список покупателей в алфавитном порядке;
б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */
public class CustomerLogic {
    CustomerView customerView = new CustomerView();
    SecondClass secondClass = new SecondClass();

    public CustomerLogic(){}

    public void initializationCustomer() {
        ArrayList<Customer> customerArrayList = secondClass.getCustomers();

        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                customerArrayList.add(new Customer());
            } else if (i % 3 == 0) {
                Address address = new Address("Belarus", "Minsk", "Winners Avenue", i);
                String lastName = "CustomerLastName " + i;
                customerArrayList.add(new Customer(99_999_999 + i + 10, lastName, address));
            } else {
                Address address = new Address("Belarus", "Minsk", "Winners Avenue", i);
                String lastName = "CustomerLastName " + i;
                customerArrayList.add(new Customer(9_999_999 + i + 100, lastName, address, i * 20 + 100));
            }
        }
    }

    public ArrayList<Customer> getAllCustomers(){
        return secondClass.getCustomers();
    }


}
