package Task_11;

public class Person {
	
	String firstName;
	String surName;
	String phoneNumber;
	String emailAddress;
	String ID;
	Address address;
	
	public Person (String firstname, String surname, String number, String email, String ID, Address address){
		this.firstName = firstname;
		this.surName = surname;
		this.phoneNumber = number;
		this.emailAddress = email;
		this.ID = ID;
		this.address = address;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getSurname(){
		return surName;
	}
	
	public String getNumber(){
		return phoneNumber;
	}
	
	public String getEmail(){
		return emailAddress;
	}
	
	public String getID(){
		return ID;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public void setFirstName(String name){
		this.firstName = name;
	}
	
	public void setSurname(String name){
		this.surName = name;
	}
	
	public void setNumber(String number){
		this.phoneNumber = number;
	}
	
	public void setEmail(String email){
		this.emailAddress = email;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	
	

}
