
public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.address = "kawisigamuwa";
		s1.ditno = 123;
		s1.name = "jahan";
		
		Student s2 = new Student();
		
	
		s2.address = "barandana";
		s2.ditno = 234;
		s2.name = "behan";
		
		System.out.println("Dit number is :"+s1.ditno);
		System.out.println("Name is :"+s1.name);
		System.out.println("Address is :"+s1.address);
		
		System.out.println();
		
		System.out.println("Dit number is :"+s2.ditno);
		System.out.println("Name is :"+s2.name);
		System.out.println("Address is :"+s2.address);
	}

}
