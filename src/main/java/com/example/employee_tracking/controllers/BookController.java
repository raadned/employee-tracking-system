package com.example.employee_tracking.controllers;

import com.example.employee_tracking.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private final List<Book> templateValues = List.of(
            new Book("book1", "author1", 1931),
            new Book("book2", "author2", 1925)
    );

    private List<Book> allBooks = new ArrayList<>(templateValues);

    @GetMapping("/employees")
    @ResponseBody
    public List<Book> getAllEmployees() {
        return allBooks;
    }

    @PostMapping("/employees")
    @ResponseBody
    public Book getAllEmployees(@RequestBody Book book) {
        allBooks.add(book);
        return book;
    }

}
