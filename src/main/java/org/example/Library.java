package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final Map<String, Book> depository;
    private final Map<String, Member> members;
    //TODO: why we need this list of books?
    // we already have a depository map that contains all the books.
    // maybe we can remove this list and use the depository map instead.
    private final List<Book> books;

    public Library() {
        this.depository = new HashMap<>();
        this.members = new HashMap<>();
        this.books = new ArrayList<>();
    }

    public Library(Map<String, Book> depository,
                   Map<String, Member> members,
                   List<Book> books) {
        this.depository = depository;
        this.members = members;
        this.books = books;
    }



    public void destroy() {
        depository.clear();
        members.clear();
        books.clear();
    }

    public void addBook(Book book) {
        depository.put(book.getIsbn(), book);
        books.add(book);
    }

    public void removeBook(String isbn) {
        depository.remove(isbn);
    }

    public Book getBook(String isbn) {
        return depository.get(isbn);
    }

    public void getAllBooks() {
        for (Book book : depository.values()) {
            System.out.println(book);
        }
    }

    public void checkOutBook(String isbn, Member member) {
    }

    public void checkInBook(String isbn, Member member) {
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public void removeMember(Member member) {
        members.remove(member.getId());
    }

    public void getAllMembers() {
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

}
