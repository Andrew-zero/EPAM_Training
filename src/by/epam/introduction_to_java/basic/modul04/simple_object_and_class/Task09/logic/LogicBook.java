package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.logic;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.Binding;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.Option;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.view.ViewBook;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.entity.Book;
import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.entity.BookShelf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Найти и вывести:
a)	список книг заданного автора;
b)	список книг, выпущенных заданным издательством;
c)	список книг, выпущенных после заданного года.
 */
public class LogicBook {
    private BookShelf bookShelf;
    private ViewBook viewBook;

    public LogicBook() {
    }

    public LogicBook(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public void initializationBook() {
        int numberBook = 20;
        ArrayList<Book> bookArrayList = getAllBook();

        for (int i = 0; i < numberBook; i++) {
            String title = "Strange things" + i;
            String publishedHouse;
            int year = 2000 + i;
            int quantityOfSheets = 10 + i;
            double price = (i + 1) * 200;
            String author;
            Binding binding;
            if (i % 2 == 0) {
                author = "someAuthor" + 0;
                binding = Binding.HARD;
                publishedHouse = "publishedHouse" + 2000;
            } else {
                author = "someAuthor" + 1;
                binding = Binding.SOFT;
                publishedHouse = "publishedHouse" + 2010;
            }
            bookArrayList.add(new Book(title, author, publishedHouse, year, quantityOfSheets, price, binding));
        }
    }

    public List<Book> resultAction(Option option){
        List<Book> listBook;

        switch(option){
            case ONE -> {
                viewBook.print("Доступны следующие авторы: ");
                viewBook.viewAuthor();
                viewBook.print("Выберите автора:->");
                listBook = choseAuthor(viewBook.inputString());
            }
            case TWO -> {
                viewBook.print("Доступны следующие издательства: ");
                viewBook.viewPublishedHouse();
                viewBook.print("Введите издательство:->");
                listBook = chosePublishedHouse(viewBook.inputString());
            }
            case THREE -> {
                viewBook.print("Введите год предшествующий выпуску книг:->");
                listBook = choseBookAfterInputYear(viewBook.inputDigit());
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }

        return listBook;
    }

    public List<Book> choseBookAfterInputYear(int year) {
        ArrayList<Book> listBooks = new ArrayList<>();

        for (Book book : getAllBook()) {
            if (book.getYearOfPublication() > year) {
                listBooks.add(book);
            }
        }

        return listBooks;
    }

    public List<Book> chosePublishedHouse(String publishedHouse) {

        return getAllBook().stream()
                .filter(book -> book.getPublishedHouse().equalsIgnoreCase(publishedHouse))
                .collect(Collectors.toList());
    }

    public List<Book> choseAuthor(String author) {

        return getAllBook().stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public ArrayList<Book> getAllBook() {
        return bookShelf.getBooks();
    }

    public BookShelf getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public ViewBook getViewBook() {
        return viewBook;
    }

    public void setViewBook(ViewBook viewBook) {
        this.viewBook = viewBook;
    }
}
