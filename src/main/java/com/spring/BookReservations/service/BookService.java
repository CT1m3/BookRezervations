package com.spring.BookReservations.service;

import com.spring.BookReservations.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void save(Book book);
    List<Book> getAll();
    void deleteById(int id);
    Optional<Book> findById(int id);
}
