package com.yogesh.studentsystem.controller;

import com.yogesh.studentsystem.controller.dto.BookDto;
import com.yogesh.studentsystem.model.Book;
import com.yogesh.studentsystem.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class bookController {

    BookService bookService;

    public bookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody BookDto bookDto){
        System.out.println(bookDto.getName());
        return bookService.addBookService(bookDto);
    }

}
