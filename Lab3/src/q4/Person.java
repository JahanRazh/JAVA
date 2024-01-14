package q4;

public class Person {
	private String name;
	private String address;

	/**
	 * @param name
	 * @param address
	 */
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	void showDetails()
	{
		System.out.println("Name is :"+ name );
		System.out.println("Address is:"+address);
	}
}


