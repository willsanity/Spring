package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pojo.Book;
import com.service.BookService;

@Controller("myController")

public class MyController {

	//@Autowired
	private BookService service; // Service
	
	@Autowired
	public void setService(BookService service){
		this.service = service;
	}
	
	public Book getShowBook(){	//Pojo
		return service.showBook1();	//
	}
	
}
