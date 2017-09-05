package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.BookDao;
import com.pojo.Book;



@Service("")

public class BookServiceImpl  implements BookService{

	BookDao ref;
	
	@Autowired

	public void setRef(BookDao ref){
		this.ref= ref;
	}
	
	@Override
	public Book showBook1(){
		return ref.showBook();
	}
	
}
