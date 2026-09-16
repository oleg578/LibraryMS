package org.example;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Book> depository;
    private final Map<String, Member> members;

    public Library() {
        this.depository = new HashMap<>();
        this.members = new HashMap<>();
    }

    public Library(Map<String, Book> depository, Map<String, Member> members) {
        this.depository = depository;
        this.members = members;
    }

    public void destroy() {
        depository.clear();
        members.clear();
    }

    public void addBook(Book book) {
        depository.put(book.getIsbn(), book);
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
