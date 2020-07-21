package com.santander.library.booklibrary.services;

import com.santander.library.booklibrary.Model.Book;
import com.santander.library.booklibrary.Repository.BookRepositoryInMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepositoryInMemory bookRepository;

    @Autowired
    public BookService(BookRepositoryInMemory bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll(){
        return this.bookRepository.getAll();
    }
}
