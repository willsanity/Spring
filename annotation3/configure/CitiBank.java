package configure;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank {

	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void showBank(){
		
		System.out.println("city bank " + name);
	}
	
}
