package q1;

import java.util.ArrayList;

public class Mainapp {
	public static void main(String[] args) {
	
		ArrayList<Item> arrList = new ArrayList<>();
		
		Book b1 = new Book(2,"book2",100.0,"dexcgxzf","eduzcation",2050);
		Book b2 = new Book(2,"book2",200.0,"def","education",200);
		
		Car c1 = new Car(3,"car1",100000.0,"toyata","a");
		Car c2 = new Car(4,"car2",200000.0,"benz","c");
		
		arrList.add(b1);
		arrList.add(c1);
		arrList.add(c2);
		
		for(Item item : arrList) {
			item.Display();
			System.out.println("");
		}
	}

}
