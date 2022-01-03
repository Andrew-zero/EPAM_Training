package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> bookArrayList;

        BookShelf bookShelf = new BookShelf();
        LogicBook logicBook = new LogicBook(bookShelf);
        ViewBook viewBook = new ViewBook(logicBook);

        logicBook.initializationBook();
        viewBook.viewBooks(logicBook.getAllBook());

        viewBook.choseCriteria();
        Option option = viewBook.choseOption(viewBook.inputDigit());
        bookArrayList = viewBook.resultAction(option);

        viewBook.viewBooks(bookArrayList);
    }
}
