package setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityApplication {

	private static ApplicationContext context;
	
	public static ApplicationContext getContext() {
		return new ClassPathXmlApplicationContext("beans01.xml");
	}
	
	
	
	public static void main(String[] args) {
		
		context = getContext();
		
		University university = (University) context.getBean("u1");
		System.out.println(university.getDept());
				
		
	}
	

}
