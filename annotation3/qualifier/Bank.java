package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bank {

	@Autowired
	@Qualifier("nick")
	Account accRef;
	
	public void setAcc(Account accRef) {
		this.accRef = accRef;
	}
	
	public Account getAcc() {
		return accRef;
	}
	
}
