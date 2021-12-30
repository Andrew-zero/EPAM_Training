package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.util.ArrayList;


/*
Найти и вывести:
а) список покупателей в алфавитном порядке;
б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */
public class CustomerLogic {
    private SecondClass secondClass;
    private CustomerView customerView;

    public CustomerLogic() {
    }

    public void setSecondClass(SecondClass secondClass){
        this.secondClass = secondClass;
    }

    public void setCustomerView(CustomerView customerView) {
        this.customerView = customerView;
    }

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

    public ArrayList<Customer> getAllCustomers() {
        return secondClass.getCustomers();
    }

    public ArrayList<Customer> sortByAlphabet(ArrayList<Customer> customerList) {
        customerList.sort((o1, o2) -> {
            if (o1.getLastName().equalsIgnoreCase(o2.getLastName())) {
                if (o1.getFirstName().equalsIgnoreCase(o2.getFirstName())) {
                    return o1.getMiddleName().compareTo(o2.getMiddleName());
                } else {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
            } else {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        return customerList;
    }

    public ArrayList<Customer> findAllRangeCustomerByCreditCard(ArrayList<Customer> customerList, int rangeFrom, int rangeTo){
        ArrayList<Customer> result = new ArrayList<>();

        for(Customer customer : customerList){
            if(customer.getCreditCardNumber() >= rangeFrom && customer.getCreditCardNumber() < rangeTo)
            result.add(customer);
        }

        return result;
    }

}
