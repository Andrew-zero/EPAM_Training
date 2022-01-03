package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();

    public BookShelf() {
    }

    public BookShelf(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
            books.remove(book);
    }
}
