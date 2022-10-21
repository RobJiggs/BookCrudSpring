/**
 * 
 */
package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.pojo.Book;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@Repository
public interface BookRepo extends JpaRepository<Book,Long> {

}
