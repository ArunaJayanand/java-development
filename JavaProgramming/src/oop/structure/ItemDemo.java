package oop.structure;

public class ItemDemo {

	/**
	 * Utility method to display an Item.
	 * @param item
	 */
	public static void displayAnItem(Item item) {
		System.out
				.println("Item is " + item.name + " and Price is " + item.price + " and  quqntity is " + item.quantity);

	}

	public static void main(String[] args) {

		Item item1 = new Item();
		item1.name = "Cereal";
		item1.price = 4.99;
		item1.quantity = 2;
		displayAnItem(item1);

		Item item2 = new Item();
		item2.name = "Pasta";
		item2.price = 6.99;
		item2.quantity = 1;
		displayAnItem(item2);
		
		Item item3 = new Item();
		item3.name = "Noodles";
		item3.price = 3.99;
		item3.quantity = 4;
		displayAnItem(item3);

	}
}
