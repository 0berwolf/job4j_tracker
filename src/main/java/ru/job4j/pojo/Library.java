package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book orlov = new Book("Путёвка в спецназ", 318);
        Book kristi = new Book("Месть Нофрет", 210);
        Book raspe = new Book("Приключения барона Мюнхаузена", 96);
        Book thatEmpty = new Book("Clean code", 120);
        Book[] books = new Book[4];
        books[0] = orlov;
        books[1] = kristi;
        books[2] = raspe;
        books[3] = thatEmpty;
        for (Book nbr : books) {
            System.out.println(nbr.getNameOfBook() + " - " + nbr.getCountPages());
        }
        System.out.println();
        System.out.println("Переставляем местами книги с индексом 0 и 3");
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book nbr = books[i];
            System.out.println(nbr.getNameOfBook() + " - " + nbr.getCountPages());
        }

        System.out.println();
        System.out.println("вывод книг с именем Clean code");
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book nbr = books[i];
            if ("Clean code".equals(nbr.getNameOfBook())) {
                System.out.println(nbr.getNameOfBook() + " - " + nbr.getCountPages());
            }
        }
    }
}
