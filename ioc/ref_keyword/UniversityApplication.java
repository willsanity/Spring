package ref_keyword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");  
		
		University uRef = (University)context.getBean("u1");
		
		System.out.println(uRef.getRefStudent().getStrRref());
		
	}

}

