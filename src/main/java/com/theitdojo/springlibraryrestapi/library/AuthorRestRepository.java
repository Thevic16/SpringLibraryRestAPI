package com.theitdojo.springlibraryrestapi.library;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorRestRepository extends PagingAndSortingRepository<Author, Long> {
}
