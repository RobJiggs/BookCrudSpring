/**
 * 
 */
package com.cogent.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.boot.controller.BookController;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@SpringBootApplication
public class JPACRUD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=SpringApplication.run(JPACRUD.class, args);
		 BookController bookController=context.getBean(BookController.class);
		 bookController.manageBook();

	}

}
