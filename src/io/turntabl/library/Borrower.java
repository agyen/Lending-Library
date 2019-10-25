package io.turntabl.library;

import java.util.Date;
import java.util.List;

public class Borrower {
    private String name;
    private String title;
    private int accountNumber;
    private Date dateBorrowed;
    private int numberOfBorrowedBooks;
    private BorrowersLevel borrowersLevel;

    public Borrower(String name, String title, int accountNumber, Date dateBorrowed, int numberOfBorrowedBooks, BorrowersLevel borrowersLevel) {
        this.name = name;
        this.title = title;
        this.accountNumber = accountNumber;
        this.dateBorrowed = dateBorrowed;
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
        this.borrowersLevel = borrowersLevel;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", accountNumber=" + accountNumber +
                ", dateBorrowed=" + dateBorrowed +
                ", numberOfBorrowedBooks=" + numberOfBorrowedBooks +
                ", borrowersLevel=" + borrowersLevel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public int getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }

    public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }

    public BorrowersLevel getBorrowersLevel() {
        return borrowersLevel;
    }

    public void setBorrowersLevel(BorrowersLevel borrowersLevel) {
        this.borrowersLevel = borrowersLevel;
    }
}
