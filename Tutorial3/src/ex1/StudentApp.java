package ex1;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student[] students = new Student[5];

	        students[0] = new Student("John Doe", "Computer Science", "123-456-7890");
	        students[1] = new Student("Jane Smith", "Electrical Engineering", "987-654-3210");
	        students[2] = new Student("Alice Johnson", "Mechanical Engineering", "555-123-4567");
	        students[3] = new Student("Bob Williams", "Physics", "777-888-9999");
	        students[4] = new Student("Eva Davis", "Biology", "444-333-2222");
	        
	        for(Student i : students) {
	        	i.print();
	            System.out.println();
	        }
	}

}
