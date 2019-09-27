package Klasser.Objects.Buildings;

import Klasser.Objects.Items.Book;

import java.util.ArrayList;

public class Library {
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
        this.books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
    public void removeBook(int i) {
        books.remove(i);
    }

    public Library(){}
}
