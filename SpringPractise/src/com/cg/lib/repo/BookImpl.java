package com.cg.lib.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.lib.bean.Book;
@Repository
public class BookImpl implements IBook {
	@PersistenceContext
	EntityManager manager;

	@Override
	public Book addBook(Book book) {
		manager.persist(book);
		manager.flush();
		return book;
		 }

}
