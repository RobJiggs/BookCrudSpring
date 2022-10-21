/**
 * 
 */
package com.cogent.boot.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@Entity
@Table(name="book_tbl")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long bookId;
	private String title;
	private String author;
	private double price;
	/**
	 * @return the id
	 */
	public long getbookId() {
		return bookId;
	}
	/**
	 * @param id the id to set
	 */
	public void setbookId(long bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param id
	 * @param title
	 * @param author
	 * @param price
	 */
	public Book(long id, String title, String author, double price) {
		super();
		this.bookId = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	/**
	 * 
	 */
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "id=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "";
	}
	
	
}
