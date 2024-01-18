package com.theitdojo.springlibraryrestapi.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String lastname;

}
