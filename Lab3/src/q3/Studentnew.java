package q3;

public class Studentnew {
	String name;
	int ditno;
	String address;
	/**
	 * @param name
	 * @param ditno
	 * @param address
	**/
	public Studentnew(String name, int ditno, String address) {
	
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}
	

	public String getDetails() {
	
		return "I am a Student.\n My name is " + name + ".\n I am from " + address + ".\n My dit no is DIT/" +ditno + ".";
    }
	

}
