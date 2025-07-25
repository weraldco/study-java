package test.sample.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Successfully added (" + book.title + ") in your collections");
    }
    public void displayBooks() {
        System.out.println("Your Collections of Books:");
        for (int i = 0; i < books.size();i++ ){
            System.out.println(books.get(i).title + " by " + books.get(i).author);
        }
    }
}

