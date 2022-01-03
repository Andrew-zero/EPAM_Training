package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;


/*
Задать критерии выбора данных и вывести эти данные на консоль.
 */
public class ViewBook {
    private LogicBook logicBook;

    public ViewBook(){}

    public ViewBook(LogicBook logicBook){
        this.logicBook = logicBook;
    }

    public void choseCriteria(){
        String message = "Выберите критерий выбора данных: ";
        print(message);

        for(Option o : Option.values()){
            print(o.getNumber() + " " + o.getDescribe());
        }

    }

    public void printBook(Book book){
        System.out.println(book.toString());
    }

    public void print(String message){
        System.out.println(message);
    }
}
