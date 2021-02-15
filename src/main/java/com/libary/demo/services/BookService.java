package com.libary.demo.services;

import com.libary.demo.models.Book;
import com.libary.demo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("Harry Potter", "JK Rowling", "12345", "1", "8.99")
    ));

    public List<Book> getAllBooks() {
       //return books;
        List<Book> books = new ArrayList<>();
        bookRepository.findAll()
                .forEach(books::add);
        return books;
    }

    public void addBook(Book book) {
       // books.add(book);
        bookRepository.save(book);
    }



    public Book getBook(String barcode){
      //  return books.stream().filter(b -> b.getBarcode().equals(barcode)).findFirst().get();
       return bookRepository.findById(barcode).get();

    }

    public Book getBookPrice(String barcode){
        return bookRepository.findById(barcode).get();

    }

    public void updateBook(String barcode, Book book){
     /*   for(int i = 0; i < books.size(); i++){
            Book b = books.get(i);
            if(b.getBarcode().equals(barcode)){
                books.set(i,book);
                return;
            }
        }*/
     bookRepository.save(book);
    }

    public void deleteBook(String barcode) {
        // books.removeIf(b -> b.getBarcode().equals(barcode));
        bookRepository.deleteById(barcode);
    }
}
