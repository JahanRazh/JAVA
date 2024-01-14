package q1;

public abstract class Car extends Item {

	private String model;
	private String type;

	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 * @param model
	 * @param type
	 */
	
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		super.Display();
		System.out.println(model);
		System.out.println(type);
	}
	
}
