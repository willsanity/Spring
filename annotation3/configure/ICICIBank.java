package configure;

import org.springframework.stereotype.Component;

@Component
public class ICICIBank implements Bank {

	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public void showBank(){
		
		System.out.println("ICICI123 " + name);
	}
	
	
}
