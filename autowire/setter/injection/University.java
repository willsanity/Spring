package setter.injection;

public class University {

	private Department dept;
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public Department getDept() {
		return dept;
	}
	
}
