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

    private List<Book> allBooks = new ArrayList<>();

    @GetMapping("/employees")
    @ResponseBody
    public List<Book> getAllEmployees() {
        return List.of(
                new Book("carte1", "marian popescu", 31),
                new Book("carte2", "dorel ionescu", 25)
        );
    }

    @PostMapping("/employees")
    public Book getAllEmployees(@RequestBody Book book) {
        allBooks.add(book);
        return book;
    }

}
