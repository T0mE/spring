package com.santander.library.booklibrary;

import com.santander.library.booklibrary.Model.Book;
import com.santander.library.booklibrary.Repository.BookRepositoryInMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStarter implements CommandLineRunner {
    private BookRepositoryInMemory repository;

    @Autowired
    public AppStarter(BookRepositoryInMemory repository) {
        this.repository = repository;
    }



    @Override
    public void run(String... args) throws Exception {
        Book pt = new Book();
        pt.setTitle("pan tadek");
        this.repository.add(pt);
        for (Book book : this.repository.getAll())
            System.out.println(book);
    }
}
