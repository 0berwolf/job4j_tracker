package ru.job4j.pojo;

public class Book {
    private String nameOfBook;
    private int countPages;

    public Book(String nameOfBook, int countPages) {
        this.nameOfBook = nameOfBook;
        this.countPages = countPages;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }
}
