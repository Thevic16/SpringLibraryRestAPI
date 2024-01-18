package com.theitdojo.springlibraryrestapi.library;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRestRepository extends PagingAndSortingRepository<Book, Long> {
}
