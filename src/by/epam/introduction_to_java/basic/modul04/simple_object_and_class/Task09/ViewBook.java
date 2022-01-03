package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задать критерии выбора данных и вывести эти данные на консоль.
 */
public class ViewBook {
    private LogicBook logicBook;

    public ViewBook(){}

    public ViewBook(LogicBook logicBook){
        this.logicBook = logicBook;
    }

    public int inputCriteria(){
        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return number;
    }

    public void choseCriteria(){
        String message = "Выберите критерий выбора данных: ";
        print(message);

        for(Option o : Option.values()){
            print(o.ordinal() + " " + o.getDescribe());
        }
    }

    public void printBook(Book book){
        System.out.println(book.toString());
    }

    public void print(String message){
        System.out.println(message);
    }
}
