package q5;

public class Student extends Person {
	
	private String studentId;
	
	/**
	 * @param name
	 * @param address
	 * @param studentId
	 */
	public Student(String name, String address, String studentId) {
		super(name, address);
		this.studentId = studentId;
	}
	// Overriding the showDetails() method to include studentId
	void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("Student ID: " + studentId);
	}
	
	
	
}
