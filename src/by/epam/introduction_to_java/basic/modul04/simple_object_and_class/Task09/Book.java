package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;



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
    private int id;
    private String title;
    private String author;
    private String publishedHouse;
    private int yearOfPublication;
    private String quantityOfSheets;
    private String price;
    private Binding typeBinding;

    public Book(){
        this.id = BookShelf.atomicInteger.getAndIncrement();
    }

    public Book(String title){
        this.id = BookShelf.atomicInteger.getAndIncrement();
        this.title = title;
    }

}
