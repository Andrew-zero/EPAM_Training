package by.epam.introduction_to_java.basic.modul05.Task02;

import java.util.List;

public class LogicPayment {

    public double totalCount(List<Payment.Product> products) {
        double result = 0;

        for (Payment.Product product : products) {
            result += product.getPrice();
        }

        return result;
    }
}
