package qualifier;

import org.springframework.stereotype.Component;

@Component
public class Account {

	private String accountType;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
}
