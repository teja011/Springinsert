package com.cg.lib.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lib.bean.Book;
import com.cg.lib.repo.BookImpl;
import com.cg.lib.repo.IBook;


@Service
@Transactional
public class IBookServiceImpl implements IBookService {

	@Autowired
	IBook ibook;
	
	public IBook getIbook() {
		return ibook;
	}

	public void setIbook(IBook ibook) {
		this.ibook = ibook;
	}



	@Override
	public Book addBook(Book book) {
		
		return ibook.addBook(book);
	}

}
