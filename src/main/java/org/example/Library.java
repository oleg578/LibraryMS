package org.example;

import org.example.domain.Book;
import org.example.service.BookService;
import org.example.domain.Member;
import org.example.service.MemberService;

import java.util.List;


public class Library {
    private final BookService bookService;
    private final MemberService memberService;

    public Library(BookService bookService,
                   MemberService memberService) {
        try {
            this.bookService = bookService;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("BookService cannot be null", e);
        }
        try {
            this.memberService = memberService;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("MemberService cannot be null", e);
        }
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public void removeBook(String isbn) {
        bookService.removeBook(isbn);
    }

    public Book getBook(String isbn) {
        return bookService.getBook(isbn);
    }

    public List<Book> getAllBooks() {
        return bookService.listBooks();
    }

    public void checkOutBook(String isbn, Member member) {
    }

    public void checkInBook(String isbn, Member member) {
    }

    public void addMember(Member member) {
    }

    public void removeMember(Member member) {
    }

    public void getAllMembers() {
    }

}
