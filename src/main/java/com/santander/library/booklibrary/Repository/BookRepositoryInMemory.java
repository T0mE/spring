package com.santander.library.booklibrary.Repository;


import com.santander.library.booklibrary.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryInMemory {
    private List<Book> books;

    public BookRepositoryInMemory(){
        this.books = new ArrayList<>();
        this.init();
    }

    public void init(){
        Book book = new Book();
        book.setAuthor("Hendryk S");
        book.setTitle("Ogiem i mieczek");
        book.setIsbn(23123123123L);
        book.setPublishYear(2000);
        book.setPublisher("PWN");

        this.books.add(book);
    }

    public List<Book> getAll(){
        return this.books;
    }

    public void add(Book book){
        if(book != null)
        this.books.add(book);
    }
}
