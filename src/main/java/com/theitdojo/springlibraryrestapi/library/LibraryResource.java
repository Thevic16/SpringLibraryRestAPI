package com.theitdojo.springlibraryrestapi.library;


import com.theitdojo.springlibraryrestapi.request.DateRange;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LibraryResource {

    BookRepository bookRepository;

    public LibraryResource(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/service/get-books-by-date-range", method = RequestMethod.POST)
    public List<Book> getBooksByDateRange(@RequestBody DateRange dateRange){
        List<Book> books = bookRepository.findAllByPublishedDateBetween(dateRange.getStartDate(), dateRange.getEndDate());

        if(books == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return books;
    }
}
