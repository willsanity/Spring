package setter.injection;

public class Department {
	
	private String departName;
	
	public void setDepartName(String departName) { // value "Computer Science" comes here and set it
		this.departName = departName;
	}
	
	@Override
	public String toString() {
		
		return departName;
	}
}
