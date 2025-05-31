package ru.amm.nikolnikova.classes;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {

            System.out.println();
            System.out.println(book);

            if (book instanceof EducationLiterature castedEducationLiterature) {
                castedEducationLiterature.hasDisk();
            }
        }

        System.out.println();
    }

    public List<Book> getBooks() {
        return books;
    }
}
