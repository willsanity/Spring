package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	 
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
 
        Library library = (Library)context.getBean("library");
        System.out.println(library);
    }
}