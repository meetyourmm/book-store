package com.zkt.bookstore.controller;

import com.zkt.bookstore.dao.BookDao;
import com.zkt.bookstore.entity.Book;
import com.zkt.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String index(HttpServletRequest request, Model model){
        String bookName = request.getParameter("name");
        List<Book> bookList = bookService.getBookList(bookName);
        model.addAttribute("books", bookList);
        return "index";//返回view视图，对应index.html
    }
}
