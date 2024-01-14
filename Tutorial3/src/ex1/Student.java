package ex1;

public class Student {
	 	private int studentID;
	    private String name;
	    private String degree;
	    private String mobile;
		public Student(String name, String degree, String mobile) {
			super();
			this.name = name;
			this.degree = degree;
			this.mobile = mobile;
		}
		public int getStudentID() {
			return studentID;
		}
		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDegree() {
			return degree;
		}
		public void setDegree(String degree) {
			this.degree = degree;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
	    // Print method
	    public void print() {
	        System.out.println("Student ID: " + studentID);
	        System.out.println("Name: " + name);
	        System.out.println("Degree: " + degree);
	        System.out.println("Mobile: " + mobile);
	    }
		
}
