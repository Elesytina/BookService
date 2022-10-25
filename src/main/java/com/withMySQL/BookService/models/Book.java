package com.withMySQL.BookService.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@NoArgsConstructor
public class Book {
    private String name;
    private String author;
    public Book(String name){
        this.name=name;
        this.author="unknown";
    }
    public void info(){
        System.out.println("Name "+ this.name + " author "+ this.author);
    }
}
