package required;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	String empName;
	Long mobile;
	
	
	public String getEmpName() {
		return empName;
	}
	
	@Required
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getMobile() {
		return mobile;
	}
	
	//@Required
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	
	
}
