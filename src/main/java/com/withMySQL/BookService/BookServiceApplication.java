package com.withMySQL.BookService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.withMySQL.BookService.services.BookService;

@SpringBootApplication
public class BookServiceApplication {

	public static void main(String[] args)  {

		final ConfigurableApplicationContext ctx=SpringApplication
				.run(BookServiceApplication.class, args);
		(ctx.getBean(BookService.class)).getBookByName(" Master and Margarite");
	}

}
