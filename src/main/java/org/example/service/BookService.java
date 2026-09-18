package org.example.service;

import org.example.domain.Book;
import org.example.domain.exception.BookNotFoundException;
import org.example.domain.exception.DuplicateBookException;

import java.util.List;

public interface BookService {
    void addBook(Book book) throws DuplicateBookException;
    void removeBook(String isbn) throws BookNotFoundException;
    Book getBook(String isbn) throws BookNotFoundException;
    List<Book> listBooks();
}