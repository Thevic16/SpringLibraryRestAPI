package com.theitdojo.springlibraryrestapi.library;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GenreRestRepository extends PagingAndSortingRepository<Genre, Long> {
}
