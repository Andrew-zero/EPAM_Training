package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.util.ArrayList;
import java.util.Comparator;


/*
Найти и вывести:
а) список покупателей в алфавитном порядке;
б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */
public class CustomerLogic {
    private static final int COUNT_NUMBERS_IN_CREDIT_CARD = 1_000;
    private static final int COUNT_NUMBERS_IN_BANK_ACCOUNT = 1_000_000_000;

    private SecondClass secondClass;

    public CustomerLogic() {
    }

    public CustomerLogic(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    public void initializationCustomer() {
        ArrayList<Customer> customerArrayList = secondClass.getAllCustomers();

        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                String lastName = "CustomerLastName " + i;
                String firstName = "CustomerFirstName " + i;
                String middleName = "CustomerMiddleName " + i;
                customerArrayList.add(new Customer(lastName, firstName, middleName));
            } else if (i % 3 == 0) {
                Address address = new Address("Belarus", "Minsk", "Winners Avenue", i);
                String lastName = "CustomerLastName " + i;
                String firstName = "CustomerFirstName " + i;
                String middleName = "CustomerMiddleName " + i;
                int bankAccountNumber = 99_999_999 + i + 10;
                if (checkBankAccountValue(bankAccountNumber)) {
                    customerArrayList.add(new Customer(bankAccountNumber, lastName, firstName, middleName, address));
                } else {
                    customerArrayList.add(new Customer(-1, lastName, firstName, middleName, address));
                }
            } else {
                Address address = new Address("Belarus", "Minsk", "Winners Avenue", i);
                String lastName = "CustomerLastName " + i;
                String firstName = "CustomerFirstName " + i;
                String middleName = "CustomerMiddleName " + i;
                int bankAccountNumber = 9_999_999 + i + 100;
                int creditCardNumber = i * 20 + 100;
                if (checkBankAccountValue(bankAccountNumber) && checkValueCreditCard(creditCardNumber)) {
                    customerArrayList.add(new Customer(bankAccountNumber, lastName, firstName, middleName, address, creditCardNumber));
                } else {
                    customerArrayList.add(new Customer(-1, lastName, firstName, middleName, address, -1));
                }
            }
        }
    }

    public ArrayList<Customer> getAllCustomers() {
        return secondClass.getAllCustomers();
    }

    public ArrayList<Customer> sortByAlphabet(ArrayList<Customer> customerList) {

        Comparator<Customer> comparator
                = Comparator.comparing(Customer::getLastName)
                .thenComparing(Customer::getFirstName)
                .thenComparing(Customer::getMiddleName);

        customerList.sort(comparator);

        return customerList;
    }

    public ArrayList<Customer> findAllRangeCustomerByCreditCard(ArrayList<Customer> customerList, int rangeFrom, int rangeTo) {
        ArrayList<Customer> result = new ArrayList<>();

        for (Customer customer : customerList) {
            if (customer.getCreditCardNumber() >= rangeFrom && customer.getCreditCardNumber() < rangeTo)
                result.add(customer);
        }

        return result;
    }

    public static boolean checkValueCreditCard(int number) {
        return number > 0 && number < COUNT_NUMBERS_IN_CREDIT_CARD;
    }

    public static boolean checkBankAccountValue(int number) {
        return number > 0 && number < COUNT_NUMBERS_IN_BANK_ACCOUNT;
    }

}
