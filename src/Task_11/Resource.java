package Task_11;

public abstract class Resource {
	String author;
	String name;
	String type;
	String ID;
	boolean available;
	
	public Resource(){
		
	}
	/**
	 * 
	 * @param author the name of the author of the resource 
	 * @param name the name of the resource
	 * @param type the type of resource i.e. book, journal etc.
	 * @param ID 
	 * @param available whether or not the resource is available
	 */
	public Resource(String author, String name, String type, String ID, boolean available){
		this.author = author;
		this.type = type;
		this.ID = ID;
		this.available = available;
		this.name = name;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getType(){
		return type;
	}
	
	public String getID(){
		return ID;
	}
	
	public boolean getAvailable(){
		return available;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAvailability(boolean availability){
		this.available = availability;
	}
	
	public void setAuthor(String string){
		this.author = string;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
}
