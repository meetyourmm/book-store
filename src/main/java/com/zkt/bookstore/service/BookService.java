package com.zkt.bookstore.service;

import com.zkt.bookstore.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getBookList(String name);
}
