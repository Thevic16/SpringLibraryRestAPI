package com.theitdojo.springlibraryrestapi.library;

import jakarta.persistence.*;

@Entity
public class Page {

    @Id
    @GeneratedValue
    private Long id;

    private Long number;

    private String header;

    private String content;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Page() {
    }

    public Page(Long number, String header, String content, Book book) {
        this.number = number;
        this.header = header;
        this.content = content;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", number=" + number +
                ", header='" + header + '\'' +
                ", content='" + content + '\'' +
                ", book=" + book +
                '}';
    }
}
