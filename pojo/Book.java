package com.pojo;

import org.springframework.stereotype.Component;

@Component

public class Book {


	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		
		return name;
	}
}
