/**
 * 
 */
package com.cogent.boot.service;

import java.util.List;

import com.cogent.boot.pojo.Book;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */

public interface BookService {
	public void addBook(Book book);
	public void deleteBookById(Long bookId);
	public Book getBookById(Long bookId);
	public List<Book> getAllBooks();
	public void updateBookbyId(Long bookId,Book book);
	

}
