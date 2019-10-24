package io.turntabl.library;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private BookCategory category;
    private BookStatus status;
    private BorrowersLevel level;


    public Book(String title, String author, String ISBN, BookCategory category, BookStatus status, BorrowersLevel level) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.category = category;
        this.status = status;
        this.level = level;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", category=" + category +
                ", status=" + status +
                ", level=" + level +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public BorrowersLevel getLevel() {
        return level;
    }

    public void setLevel(BorrowersLevel level) {
        this.level = level;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
