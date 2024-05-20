package exercise3;

public class PhoneBookEntry {
	private String name;
	private String phoneNumber;
	private String description;
	
	public PhoneBookEntry()	{
		
	}
	public PhoneBookEntry (String name, String number, String des) {
		this.name = name;
		this.phoneNumber = number;
		this.description = des;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void display() {
		System.out.println("name: " + name);
		System.out.println("phone number: " + phoneNumber);
		System.out.println("drscription: " + description);
	}
	
	
	
	
}
