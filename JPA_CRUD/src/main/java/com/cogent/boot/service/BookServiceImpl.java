/**
 * 
 */
package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.pojo.Book;
import com.cogent.boot.repo.BookRepo;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookRepo.save(book);

	}

	@Override
	public void deleteBookById(Long bookId) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(bookId);
	}

	@Override
	public Book getBookById(Long bookId) {
		// TODO Auto-generated method stub
		return (Book) bookRepo.getReferenceById(bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public void updateBookbyId(Long bookId, Book book) {
		// TODO Auto-generated method stub

	}

}
