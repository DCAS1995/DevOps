package Task_11;

public class Address {
	String line1;
	String line2;
	String town;
	String postcode;
	
	public Address(String line1, String line2, String town, String postcode){
		this.line1 = line1;
		this.line2 = line2;
		this.town = town;
		this.postcode = postcode;
	}
	
	public String getLine1(){
		return line1;
	}
	
	public String getLine2(){
		return line2;
	}
	
	public String getTown(){
		return town;
	}
	
	public String getPostcode(){
		return postcode;
	}
}
