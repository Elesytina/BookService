package com.withMySQL.BookService.services;

import com.withMySQL.BookService.interfaces.Logger;
import com.withMySQL.BookService.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("service")
public class BookService {
     private Logger logger;
     @Autowired
     public BookService(Logger logger){
         this.logger=logger;
     }
    public Book getBookByName(String bookname){
        logger.print("Searching "+ bookname);
        Book book=new Book(bookname);
        book.info();
        return book;
    }
}
