package required;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		/*ClassPathResource resource = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);*/
		
		Employee ref = (Employee)context.getBean("e1");
		System.out.println(ref.getEmpName());
		System.out.println(ref.getMobile());
		
	}
	
}
