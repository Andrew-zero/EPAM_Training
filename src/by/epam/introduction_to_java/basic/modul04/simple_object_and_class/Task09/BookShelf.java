package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;

import java.util.concurrent.atomic.AtomicInteger;

public class BookShelf {
    private static final int MAX_BOOK = 10;

    private Book[] books = new Book[MAX_BOOK];
    public static volatile AtomicInteger atomicInteger = new AtomicInteger(0);

    public BookShelf(){}

    public BookShelf(Book[] books){
        this.books = books;
    }


}
