package q1;

public abstract class Book extends Item {
	private String publisher;
	private String category;
	private int pages;

	public Book(int itemNo, String description, double unitPrice, String publisher, String category, int pages) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}
	public void Display() {
		super.Display();
		System.out.println(publisher);
		System.out.println(category);
		System.out.println(pages);
	}
		
	
	

}
