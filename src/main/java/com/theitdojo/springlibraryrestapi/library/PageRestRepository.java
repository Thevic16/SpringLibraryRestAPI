package com.theitdojo.springlibraryrestapi.library;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PageRestRepository extends PagingAndSortingRepository<Page, Long> {
}
