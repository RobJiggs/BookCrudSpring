/**
 * 
 */
package com.cogent.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.boot.pojo.Book;
import com.cogent.boot.service.BookService;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@Controller
public class BookController {
	@Autowired
	BookService bookService;

	
	public void manageBook() {
		Book book= new Book();
		book.setTitle("The Jiggs Way");
		book.setAuthor("Rob Jiggs");
		book.setPrice(200);
	
		bookService.addBook(book);
		System.out.println("Done!");
	}
	
}
