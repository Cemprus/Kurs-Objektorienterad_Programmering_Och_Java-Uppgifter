import Klasser.Objects.Buildings.Library;
import Klasser.Objects.Humans.Borrower;
import Klasser.Objects.Items.Book;

import java.util.Random;

public class Uppgift_library {
    public static void main(String[] args) {
        Random rng = new Random();
        Library l = new Library();
        Borrower[] b = new Borrower[3];
        b[0] = new Borrower("Ruscemp", "Unknown", "20000101-0101");
        b[1] = new Borrower("David", "Stockholm", "20000101-0101");
        b[2] = new Borrower("Jack", "New York", "20000101-0101");
        for (int i = 0; i < 10; i++) {
            String s = "Book " + (1 + i);
            l.addBook(new Book(s, i));
        }
        Book book = new Book("Specifik bok", 10);
        l.addBook(book);
        b[rng.nextInt(3)].borrowBook(l, book);

        System.out.println("Bibleotekets böcker: " + l.getBooksList());
        b[1].borrowBook(l, 4);
        b[0].borrowBook(l, l.getBooksList().size()-1);
        b[2].borrowBook(l, 2);
        System.out.println("Bibleotekets böcker: " + l.getBooksList());
        for (Borrower borrower : b) {
            System.out.println("Låntagares böcker: " + borrower.getBooksList());
        }
        if (book.findBookBorrower(b, book) == null) {
            System.out.println("Kunde inte hitta låntagare med boken " + book);
        } else {
            System.out.println("Låntagare som lånade böcken \"" + book + "\" är " + book.findBookBorrower(b, book).getName());
        }
    }
}
