package com.theitdojo.springlibraryrestapi.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class LibraryCommandLineRunner implements CommandLineRunner {
    AuthorRepository authorRepository;
    GenreRepository genreRepository;
    PageRepository pageRepository;
    BookRepository bookRepository;

    public LibraryCommandLineRunner(AuthorRepository authorRepository, GenreRepository genreRepository,
                                    PageRepository pageRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.genreRepository = genreRepository;
        this.pageRepository = pageRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        authorRepository.save(new Author("Jane", "Doe"));
        authorRepository.save(new Author("John", "Smith"));
        authorRepository.save(new Author("Emily", "Johnson"));
        authorRepository.save(new Author( "Alex", "Turner"));
        authorRepository.save(new Author( "Samantha", "Roberts"));
        authorRepository.save(new Author( "Michael", "Anderson"));
        authorRepository.save(new Author( "Jessica", "Taylor"));
        authorRepository.save(new Author( "Benjamin", "Williams"));
        authorRepository.save(new Author( "Olivia", "Davis"));
        authorRepository.save(new Author("David", "Miller"));

        genreRepository.save(new Genre("Mystery"));
        genreRepository.save(new Genre("Science Fiction"));
        genreRepository.save(new Genre("Romance"));
        genreRepository.save(new Genre("Thriller"));
        genreRepository.save(new Genre("Adventure"));
        genreRepository.save(new Genre("Suspense"));
        genreRepository.save(new Genre("Fantasy"));
        genreRepository.save(new Genre("Mystery"));
        genreRepository.save(new Genre("Romance"));
        genreRepository.save(new Genre("Action"));

        bookRepository.save(new Book("The Enigma Code",
                authorRepository.findAllByAuthorByNameAndLastname("Jane", "Doe"),
                genreRepository.findAllByGenreByName("Mystery"), null, LocalDate.parse("2023-05-15")));

        bookRepository.save(new Book("Echoes of Eternity",
                authorRepository.findAllByAuthorByNameAndLastname("John", "Smith"),
                genreRepository.findAllByGenreByName("Science Fiction"), null, LocalDate.parse("2022-11-28")));

        bookRepository.save(new Book("Whispers in the Wind",
                authorRepository.findAllByAuthorByNameAndLastname("Emily", "Johnson"),
                genreRepository.findAllByGenreByName("Romance"), null, LocalDate.parse("2024-02-10")));

        bookRepository.save(new Book("Lost in the Shadows",
                authorRepository.findAllByAuthorByNameAndLastname("Alex", "Turner"),
                genreRepository.findAllByGenreByName("Thriller"), null, LocalDate.parse("2023-09-03")));

        bookRepository.save(new Book("Beyond the Horizon",
                authorRepository.findAllByAuthorByNameAndLastname("Samantha", "Roberts"),
                genreRepository.findAllByGenreByName("Adventure"), null, LocalDate.parse("2022-07-19")));

        bookRepository.save(new Book("The Art of Deception",
                authorRepository.findAllByAuthorByNameAndLastname("Michael", "Anderson"),
                genreRepository.findAllByGenreByName("Suspense"), null, LocalDate.parse("2023-12-05")));

        bookRepository.save(new Book("Serenade for the Stars",
                authorRepository.findAllByAuthorByNameAndLastname("Jessica", "Taylor"),
                genreRepository.findAllByGenreByName("Fantasy"), null, LocalDate.parse("2024-01-22")));

        bookRepository.save(new Book("Silent Echo",
                authorRepository.findAllByAuthorByNameAndLastname("Benjamin", "Williams"),
                genreRepository.findAllByGenreByName("Mystery"), null, LocalDate.parse("2023-04-08")));

        bookRepository.save(new Book("In the Line of Fire",
                authorRepository.findAllByAuthorByNameAndLastname("David", "Miller"),
                genreRepository.findAllByGenreByName("Action"), null, LocalDate.parse("2024-03-11")));

    }
}