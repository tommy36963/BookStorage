package com.libary.demo.repositories;

import com.libary.demo.models.Book;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, String> {
    public List<Book> findBookPrice(String barcode);


}
