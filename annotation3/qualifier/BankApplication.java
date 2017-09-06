package qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("configQualifier.xml");
		Bank b = (Bank)context.getBean("b");
		System.out.println(b.getAcc().getAccountType());
		
	}

}
