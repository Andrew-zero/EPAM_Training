package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задать критерии выбора данных и вывести эти данные на консоль.
 */
public class CustomerView {
    private CustomerLogic customerLogic;

    public CustomerView() {
    }

    public void setCustomerLogic(CustomerLogic customerLogic) {
        this.customerLogic = customerLogic;
    }

    public void choseOption() {
        System.out.println("Выберите критерий выбора данных: ");

        for (Options o : Options.values()) {
            System.out.println(o.name() + " - " + o.getDiscribe());
        }
    }



    public int inputNumber() {
        int result = -1;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            result = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.getCause();
        }

        return result;
    }

    public static void print(String s) {
        System.out.println();
    }
}
