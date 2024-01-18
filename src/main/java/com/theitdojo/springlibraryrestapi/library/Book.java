package com.theitdojo.springlibraryrestapi.library;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Book")
    private List<Author> authors;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Book")
    private List<Genre> genres;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Book")
    private List<Page> pages;

    private Date publishedDate;

    public Book() {
    }

    public Book(Long id, String name, List<Author> authors, List<Genre> genres, List<Page> pages, Date publishedDate) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.genres = genres;
        this.pages = pages;
        this.publishedDate = publishedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
