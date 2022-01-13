package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.entity;

import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.entity.Book;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookShelf bookShelf = (BookShelf) o;
        return Objects.equals(books, bookShelf.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }
}
