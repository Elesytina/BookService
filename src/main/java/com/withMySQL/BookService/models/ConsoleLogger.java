package com.withMySQL.BookService.models;

import com.withMySQL.BookService.interfaces.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("consoleLogger")
@Primary
public class ConsoleLogger implements Logger {
    @Override
    public void print(Object object) {
        System.out.println(object);
    }
}
