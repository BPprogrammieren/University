package exercise3;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
	private String name;
	private Set<PhoneBookEntry> entries = new HashSet<PhoneBookEntry>();
	
	public  PhoneBook(String name) {
		this.name = name;
	}
	
	public PhoneBookEntry searchByName(String name) {
		PhoneBookEntry entry = new PhoneBookEntry();
		for(PhoneBookEntry par : entries) {
			if(par.getName() == name) {
				entry = par;
			}
		}
		return entry;
	}
	
	public void addNewEntry(String name, String number, String des) {
		PhoneBookEntry newEntry = new PhoneBookEntry(name,number,des);
		entries.add(newEntry);
	}
	
	public Set<PhoneBookEntry> getEntries() {
		return entries;
	}
		
	public String getName() {
		return name;
	}
		
}
