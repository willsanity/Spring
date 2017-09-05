package ref_keyword;

public class University {

	//University has reference to Student Class
	private Student refStudent; // Has-a relationship

	public Student getRefStudent() {
		return refStudent;
	}

	public void setRefStudent(Student refStudent) {
		this.refStudent = refStudent;
	}
	
	
	
}
