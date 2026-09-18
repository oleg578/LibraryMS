package org.example.service.impl;

import org.example.domain.Book;
import org.example.domain.exception.BookNotFoundException;
import org.example.domain.exception.DuplicateBookException;
import org.example.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public void addBook(Book book) throws DuplicateBookException {

    }

    @Override
    public void removeBook(String isbn) throws BookNotFoundException {

    }

    @Override
    public Book getBook(String isbn) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> listBooks() {
        return List.of();
    }
}
