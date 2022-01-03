package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task09;


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

    public LogicBook() {
    }

    public LogicBook(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public void initializationBook() {
        ArrayList<Book> bookArrayList = getAllBook();

        for(int i = 0; i < 20; i++){

        }


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

}
