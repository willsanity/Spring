package constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StateApplication {
	
	private static ApplicationContext context;
	
	public static ApplicationContext getContext(){
		return new ClassPathXmlApplicationContext("beans02.xml");
	}

	public static void main(String[] args) {

		context = getContext();
		
		State state = (State)context.getBean("S1");
		System.out.println(state);
		
	}

}
