package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private	BookVisitor bookV = new BookVisitor();
	private CDVisitor cdV = new CDVisitor();

	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		for(Item i : items)
			i.accept(bookV);
	}

	public void printOnlyCDs() {
		for(Item i : items)
			i.accept(cdV);
	}

}
