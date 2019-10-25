package io.turntabl.io;

import io.turntabl.library.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import  java.util.List;

public class Main {

    public static void main(String[] args) {
       List<Book> books = Arrays.asList(
               new Book("The Journey", "Isaac Agyen", "EF1234", BookCategory.ADVENTURE, BookStatus.AVAILABLE, BorrowersLevel.GOLD),
               new Book("Legends", "Effah Dennis", "EF1234", BookCategory.ADVENTURE, BookStatus.BORROWED, BorrowersLevel.GOLD),
               new Book("Lova at first sight", "John Erbynn", "EF1234", BookCategory.ROMANTIC, BookStatus.AVAILABLE, BorrowersLevel.GOLD),
               new Book("Cold World", "Ismail Dawud", "EF1234", BookCategory.FICTION, BookStatus.BORROWED, BorrowersLevel.GOLD),
               new Book("Could this be love", "Isaac Agyen", "EF1234", BookCategory.ROMANTIC, BookStatus.AVAILABLE, BorrowersLevel.GOLD),
               new Book("Kill it", "Patricia Kasapa", "EF1234", BookCategory.COMIC, BookStatus.BORROWED, BorrowersLevel.GOLD),
               new Book("All Die Be Die ", "Akufu Addo", "EF1234", BookCategory.ADVENTURE, BookStatus.AVAILABLE, BorrowersLevel.GOLD),
               new Book("The Great", "James Wilson", "EF1234", BookCategory.HISTORIC, BookStatus.BORROWED, BorrowersLevel.GOLD),
               new Book("Ocean", "Anita Mens", "EF1234", BookCategory.FICTION, BookStatus.AVAILABLE, BorrowersLevel.GOLD),
               new Book("Crime", "William Williams", "EF1234", BookCategory.ADVENTURE, BookStatus.BORROWED, BorrowersLevel.GOLD),
               new Book("1998", "Christopher Athur", "EF1234", BookCategory.HISTORIC, BookStatus.BORROWED, BorrowersLevel.GOLD),
               new Book("Sharp", "Vida Tweneboah", "EF1234", BookCategory.FICTION, BookStatus.AVAILABLE, BorrowersLevel.GOLD)
       );

       List<Borrower> borrowers = Arrays.asList(
               new Borrower("David De Gea", "Legends", 12343, new Date(), 1, BorrowersLevel.GOLD),
               new Borrower("Sam Moorhouse", "Cold Worls", 12343, new Date(), 1, BorrowersLevel.GOLD),
               new Borrower("Shadrack Amoako", "1998", 12343, new Date(), 1, BorrowersLevel.REGULAR),
               new Borrower("Akua Serwaa", "Crime", 12343, new Date(), 1, BorrowersLevel.CHILDREN),
               new Borrower("Francis Billa", "The Great", 12343, new Date(), 1, BorrowersLevel.PREMIUM),
               new Borrower("kate Mensah", "Kiil it", 12343, new Date(), 1, BorrowersLevel.GOLD)
           );

       List<Book> availableRomanticbooks = new ArrayList<>();
               for(Book romantic: books){
                   if(romantic.getCategory() == BookCategory.ROMANTIC){
                       availableRomanticbooks.add(romantic);
                   }

               }
       List<String> remainingRomanticBook = new ArrayList<>();
               for(Book romanticBooks: availableRomanticbooks){
                   remainingRomanticBook.add(romanticBooks.getTitle());
               }
               printAvailablleRomanticBooks(availableRomanticbooks);

       List<Borrower> levelOfBorrower = new ArrayList<>();
               for (Borrower gold : borrowers){
                   if(gold.getBorrowersLevel() == BorrowersLevel.GOLD){
                       levelOfBorrower.add(gold);
                   }

               }

       List<String> namesOfGoldBorrowers = new ArrayList<>();
               for(Borrower names : levelOfBorrower){
                   namesOfGoldBorrowers.add(names.getName());
               }

               printNames(namesOfGoldBorrowers);
    //private static void printNames(List<>)
    }

    private static void printAvailablleRomanticBooks(List<Book> availableRomanticbooks) {
        System.out.println("Available romantic books are: " + availableRomanticbooks);
    }

    private static void printNames(List<String> namesOfGoldBorrowers) {
        System.out.println("Names of gold Borrowers: " + namesOfGoldBorrowers);
    }
}
