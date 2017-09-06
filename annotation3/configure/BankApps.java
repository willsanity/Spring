package configure;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApps {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyController.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name: ");
		String choice = sc.next();
		
		Bank ref = (Bank)context.getBean(choice);
		ref.showBank();
		
	}

}
