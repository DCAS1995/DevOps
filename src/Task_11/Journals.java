package Task_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Journals extends Resource {
	
	private String field;
	private Date date;
	private SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
	
	public Journals(String author, String name, String type, String ID, boolean available, String field, String date){
		super (author, name, type, ID, available);
			this.field = field;
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
	
	public String getField(){
		return field;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setField(String string){
		this.field = string;
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
