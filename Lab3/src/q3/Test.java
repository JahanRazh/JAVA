package q3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1 = new Student();
		 Student s2 = new Student();
		
		s1.setName("jahan");
		s1.setDitno(232); 
		s1.setAddress("kawisigamuwa");
		s2.setName("lakmuthu");
		s2.setDitno(456);
		s2.setAddress("barandana");
		
		System.out.println(s1.getDetails());
		System.out.println(s2.getDetails());
	}


}
