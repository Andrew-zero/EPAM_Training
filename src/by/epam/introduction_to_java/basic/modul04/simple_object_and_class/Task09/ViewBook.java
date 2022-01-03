package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Задать критерии выбора данных и вывести эти данные на консоль.

Найти и вывести:
a)	список книг заданного автора;
b)	список книг, выпущенных заданным издательством;
c)	список книг, выпущенных после заданного года.
 */
public class ViewBook {
    private LogicBook logicBook;

    public ViewBook(){}

    public ViewBook(LogicBook logicBook){
        this.logicBook = logicBook;
    }

    public List<Book> resultAction(Option option){
        List<Book> listBook;

        switch(option){
            case ONE -> {
                print("Доступны следующие авторы: ");
                viewAuthor();
                print("Выберите автора:->");
                listBook = logicBook.choseAuthor(inputString());
            }
            case TWO -> {
                print("Доступны следующие издательства: ");
                viewPublishedHouse();
                print("Введите издательство:->");
                listBook = logicBook.chosePublishedHouse(inputString());
            }
            case THREE -> {
                print("Введите год предшествующий выпуску книг:->");
                listBook = logicBook.choseBookAfterInputYear(inputDigit());
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }

        return listBook;
    }

    public void viewPublishedHouse(){
        Set<String> publishedHouse = new HashSet<>();

        for(Book b : logicBook.getAllBook()){
            publishedHouse.add(b.getPublishedHouse());
        }

        for(String s : publishedHouse){
            print(s);
        }
    }

    public void viewAuthor(){
        Set<String> author = new HashSet<>();

        for(Book b : logicBook.getAllBook()){
            author.add(b.getAuthor());
        }

        for(String s : author){
            print(s);
        }
    }

    public Option choseOption(int number){
        if(!(number >= 0 && number < Option.values().length)){
            throw new IllegalArgumentException("Выбрана не верная опция");
        }

        return Option.values()[number];
    }

    public int inputDigit(){
        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return number;
    }

    public String inputString(){
        String string = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            string = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return string;
    }

    public void choseCriteria(){
        String message = "Выберите критерий выбора данных: ";
        print(message);

        for(Option o : Option.values()){
            print(o.ordinal() + " " + o.getDescribe());
        }
    }

    public void viewBooks(List<Book> list){
        for(Book book : list){
            print(book.toString());
        }
    }

    public void print(Book book){
        System.out.println(book.toString());
    }

    public void print(String message){
        System.out.println(message);
    }
}
