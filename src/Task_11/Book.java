package Task_11;

public class Book extends Resource {
	private String genre;
	
	public Book (String author, String name, String type, String ID, boolean available, String genre){
		super(author, name, type, ID, available);
			this.genre = genre;
			this.setAuthor(author);
			this.setName(name);
			this.setType(type);
			this.setID(ID);
			this.setAvailability(available);
	}
	
	public String getGenre(){
		return genre;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	
}
