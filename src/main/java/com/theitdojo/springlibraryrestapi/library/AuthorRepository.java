package com.theitdojo.springlibraryrestapi.library;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findAllByNameAndLastname(String name, String lastname);
}
