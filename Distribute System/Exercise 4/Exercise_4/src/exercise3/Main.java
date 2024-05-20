package exercise3;

public class Main {

	public static void main(String[] args) {
		PhoneBook book1 = new PhoneBook("book1");
		book1.addNewEntry("Alex", "0123456", "home");
		book1.addNewEntry("Sel", "09987", "home");
		book1.addNewEntry("Alex", "045985", "office");
		book1.addNewEntry("Sedd", "35", "home");
		book1.addNewEntry("Sel", "04630", "office");
		

		for(PhoneBookEntry entry : book1.getEntries()) {
			book1.searchByName("S").display();
//			entry.display();
		}
	}

}
