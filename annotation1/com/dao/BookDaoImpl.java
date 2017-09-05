package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojo.Book;

@Repository(" ")
public class BookDaoImpl implements BookDao {

	@Autowired //replace "ref" keyword
	Book b;
	
	@Override
	public Book showBook(){
		
		//Book b = new Book(); no need to create object of Book. @Autowired does it.
		b.setName("spring");
		return b;
	}
}
