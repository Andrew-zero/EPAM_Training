package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.entity;


import by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09.Binding;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/*
9.	Создать класс Book, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().

Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.

Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:
a)	список книг заданного автора;
b)	список книг, выпущенных заданным издательством;
c)	список книг, выпущенных после заданного года.

 */
public class Book {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String title;
    private String author;
    private String publishedHouse;
    private int yearOfPublication;
    private int quantityOfSheets;
    private double price;
    private Binding typeBinding;

    public Book(){
        this.id = count.getAndIncrement();
    }

    public Book(String title){
        this.id = count.getAndIncrement();
        this.title = title;
    }

    public Book(String title, String author) {
        this.id = count.getAndIncrement();
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String publishedHouse) {
        this.id = count.getAndIncrement();
        this.title = title;
        this.author = author;
        this.publishedHouse = publishedHouse;
    }

    public Book(String title, String author, String publishedHouse, int yearOfPublication) {
        this.id = count.getAndIncrement();
        this.title = title;
        this.author = author;
        this.publishedHouse = publishedHouse;
        this.yearOfPublication = yearOfPublication;
    }

    public Book(String title, String author, String publishedHouse, int yearOfPublication, int quantityOfSheets) {
        this.id = count.getAndIncrement();
        this.title = title;
        this.author = author;
        this.publishedHouse = publishedHouse;
        this.yearOfPublication = yearOfPublication;
        this.quantityOfSheets = quantityOfSheets;
    }

    public Book(String title, String author, String publishedHouse, int yearOfPublication, int quantityOfSheets, double price) {
        this.id = count.getAndIncrement();
        this.title = title;
        this.author = author;
        this.publishedHouse = publishedHouse;
        this.yearOfPublication = yearOfPublication;
        this.quantityOfSheets = quantityOfSheets;
        this.price = price;
    }

    public Book(String title, String author, String publishedHouse, int yearOfPublication, int quantityOfSheets, double price, Binding typeBinding) {
        this.id = count.getAndIncrement();
        this.title = title;
        this.author = author;
        this.publishedHouse = publishedHouse;
        this.yearOfPublication = yearOfPublication;
        this.quantityOfSheets = quantityOfSheets;
        this.price = price;
        this.typeBinding = typeBinding;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishedHouse() {
        return publishedHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getQuantityOfSheets() {
        return quantityOfSheets;
    }

    public Binding getTypeBinding() {
        return typeBinding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publishedHouse, book.publishedHouse) && Objects.equals(quantityOfSheets, book.quantityOfSheets) && Objects.equals(price, book.price) && typeBinding == book.typeBinding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publishedHouse, yearOfPublication, quantityOfSheets, price, typeBinding);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedHouse='" + publishedHouse + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", quantityOfSheets=" + quantityOfSheets +
                ", price=" + price +
                ", typeBinding=" + typeBinding +
                '}';
    }
}
