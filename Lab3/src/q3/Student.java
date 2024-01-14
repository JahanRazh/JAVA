package q3;

public class Student {
	String name;
	int ditno;
	String address;
	/**
	 * @param name
	 * @param ditno
	 * @param address
	
	public Student(String name, int ditno, String address) {
		super();
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}
	 */

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setDitno(int ditno) {
		this.ditno = ditno;
	}
	public int getDitno() {
		return ditno;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	
	public String getDetails() {
	
		return "I am a Student.\n My name is " + name + ".\n I am from " + address + ".\n My dit no is DIT/" +ditno + ".";
    }
	

}
