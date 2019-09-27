package Klasser.Objects.Humans;

import Klasser.Objects.Buildings.Library;
import Klasser.Objects.Items.Book;

import java.util.ArrayList;


public class Borrower  extends Person{
    private ArrayList<Book> books = new ArrayList<Book>();



    public ArrayList<Book> getBooksList() {
        return books;
    }

    public Book getBook(int i) {
        return books.get(i);
    }
    public Book getBook(Book book) {
        return books.get(books.indexOf(book));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
    public void removeBook(int i) {
        books.remove(i);
    }

    public void borrowBook(Library l, Book book) {
        addBook(l.getBook(book));
        l.removeBook(book);
    }
    public void borrowBook(Library l, int i) {
        addBook(l.getBook(i));
        l.removeBook(i);
    }

    public void returnBook(Library l, Book book) {
        l.addBook(getBook(book));
        removeBook(book);
    }
    public void returnBook(Library l, int i) {
        l.addBook(getBook(i));
        removeBook(i);
    }

    public Borrower(Person borrower) {
        creatingSet(borrower.getName(),borrower.getAdress(),borrower.getPersonnummer());
    }
    public Borrower(String Name, String Adress, String Personnummer) {
        creatingSet(Name, Adress, Personnummer);
    }
}
