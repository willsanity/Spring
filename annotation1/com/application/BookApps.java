package com.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.MyController;

public class BookApps {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
		MyController ref = (MyController) context.getBean("myController");
		System.out.println(ref.getShowBook());
		
	}

}
