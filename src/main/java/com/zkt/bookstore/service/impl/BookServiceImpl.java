package com.zkt.bookstore.service.impl;

import com.zkt.bookstore.dao.BookDao;
import com.zkt.bookstore.entity.Book;
import com.zkt.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public List<Book> getBookList(String name) {
        return bookDao.getBookList(name);
    }
}
