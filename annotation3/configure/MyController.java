package configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("configure")

public class MyController {

	@Autowired
	ICICIBank iciciRef;
	
	@Autowired
	HdfcBank hdfcRef;
	
	@Autowired
	CitiBank citiRef;
	
	@Bean(name="icici")
	public Bank getBank1(){ //beans
		//ICICIBank ref = new ICICIBank(); no need to create object manually.
		iciciRef.setName("testing 1");
		return iciciRef;
	}
	
	@Bean(name="hdfc")
	public Bank getBank2(){ //beans
		hdfcRef.setName("testing 2");
		return iciciRef;
}
	@Bean(name="citi")
	public Bank getBank3(){ //beans
		citiRef.setName("testing 3");
		return citiRef;
	
}
	
}
