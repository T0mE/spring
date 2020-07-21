package com.santander.library.booklibrary.Model;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book {
    private String author;
    private String title;
    private Long isbn;
    private Integer publishYear;
    private String publisher;
}
