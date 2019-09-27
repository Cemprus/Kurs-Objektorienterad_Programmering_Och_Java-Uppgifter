package Klasser.Objects.Items;

import Klasser.Objects.Humans.Borrower;

public class Book {
    private String Name;
    private int Index;

    public Borrower findBookBorrower(Borrower[] b, Book book) {
        boolean t;
        for (Borrower borrower : b) {
            t = borrower.getBooksList().contains(book);
            if (t) {
                return borrower;
            }
        }
        return null;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }

    public Book(String namn, int index) {
        setName(namn);
        setIndex(index);
    }

    @Override
    public String toString() {
        return getName()+" med böckens privata index " + getIndex();
    }
}
