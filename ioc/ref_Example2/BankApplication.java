
package ref_Example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BankApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Bank uRef = (Bank)context.getBean("u2");
		
		System.out.println(uRef.getRefEmployer().getRefAddress().getStrRref());
	}

}
