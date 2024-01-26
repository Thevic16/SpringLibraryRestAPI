package com.theitdojo.springlibraryrestapi.library;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findBookByName(String name);

    List<Book> findAllByPublishedDateBetween(LocalDate startDate, LocalDate endDate);
}
