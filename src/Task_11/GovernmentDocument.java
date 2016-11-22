package Task_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class GovernmentDocument extends Resource {
	
	private String department;
	private Date date;
	private SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
	
	public GovernmentDocument(String author, String name, String type, String ID, boolean available, String department, String date){
	super (author, name, type, ID, available);
		this.department = department;
		try {
			this.date = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.setAuthor(author);
		this.setType(type);
		this.setID(ID);
		this.setAvailability(available);
		this.setName(name);
	}
	
	public String getDeparment(){
		return department;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDepartment(String string){
		this.department = string;
	}
	
	public void setDate(String date){
		try{
			this.date = format.parse(date);
		}
		catch (ParseException e){
			e.printStackTrace();
		}
	}

}
