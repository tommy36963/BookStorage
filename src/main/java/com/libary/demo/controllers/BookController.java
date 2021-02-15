package com.libary.demo.controllers;

import com.libary.demo.models.Book;
import com.libary.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Path;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    private String barcode;

    @RequestMapping("books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping("books/{barcode}")
    public Book getBook(@PathVariable String barcode) {
        return bookService.getBook(barcode);
    }

    @RequestMapping(method = RequestMethod.POST, value="books")
    public void addBook(@RequestBody Book book){
         bookService.addBook(book);
        
    }
    @RequestMapping(method = RequestMethod.DELETE, value="books{barcode}")
    public void deleteBook(@PathVariable String barcode){
        bookService.deleteBook(barcode);

    }

    @RequestMapping(method = RequestMethod.PUT, value="books/{barcode}")
    public void updateBook(@RequestBody Book book, @PathVariable String barcode){
        bookService.updateBook(barcode,book);

    }
}
