package com.theitdojo.springlibraryrestapi.library;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Book")
    private List<Author> authors;

    private Date publishedDate;

}
