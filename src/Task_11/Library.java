package Task_11;

import java.util.List;
import java.util.ArrayList;

public class Library {

	List<Resource> inLibrary = new ArrayList<Resource>();
	List<Resource> checkedOut = new ArrayList<Resource>();
	List<Person> members = new ArrayList<Person>();
	
	public Library(){
	}
	
	/**
	 * @param resource Created Resource with all fields such as ID, name, type, author etc.
	 */
	public void CheckOutResource(Resource resource){
		if (CheckAvailability(resource) > 0){
			checkedOut.add(resource);
			UpdateResourceAvailability(resource, false);
		}
	}
	
	/**
	 * @param resource Created Resource with all fields such as ID, name, type, author etc.
	 */
	public void CheckInResource(Resource resource){
		for (int i=0; i < checkedOut.size(); i++){
			if (checkedOut.get(i).getID() == resource.getID()){
				checkedOut.remove(checkedOut.get(i));
			}
			else{
				AddResource(resource);
			}
		}
		
		UpdateResourceAvailability(resource,true);
	}
		
	/**
	 * @param resource Created Resource with all fields such as ID, name, type, author etc.
	 */
	public void AddResource(Resource resource){
		if(CheckID(resource)){
			inLibrary.add(resource);
		}
	}
	
	/**
	 * @param name The name of the resouce so more than one can be removed if need be
	 * @param quantity number of that resource that should be removed
	 */
	public void RemoveResource(String name, int quantity){
		for (int i=1; i<=quantity; i++){
			for (int j=0; j<inLibrary.size(); j++){
				if(inLibrary.get(j).getName() == name){
					inLibrary.remove(inLibrary.get(j));
					break;
				}
			}
		}
	}
	
	/**
	 * @param ID String ID to identify the resource
	 */
	public void RemoveResource(String ID){
		for (int i=0; i<inLibrary.size(); i++){
			if (inLibrary.get(i).getID() == ID){
				inLibrary.remove(inLibrary.get(i));
			}
		}
	}
	
	/**
	 * @param resource Created Resource with all fields such as ID, name, type, author etc.
	 * @param availability
	 */
	public void UpdateResourceAvailability(Resource resource, boolean availability){
		for (int i=0; i<inLibrary.size(); i++){
			if(inLibrary.get(i).getID() == resource.getID()){
				resource.setAvailability(availability);
			}
		}
	}
	
	/**
	 * @param book Created Book with all fields such as ID, name, genre etc.
	 * @param att an integer corresponding to the position of each field in the constructor class for Book
	 * @param change the new value to be put into the chosen field
	 */
	public void UpdateResource(Book book, int att, String change){
		for (int i=0; i<inLibrary.size(); i++){
			if(inLibrary.get(i).getID() == book.getID()){
				if (att == 1){
					book.setAuthor(change);
				}
				else if(att==2){
					book.setName(change);
				}
				else if(att==3){
					book.setType(change);
				}
				else if(att==4){
					book.setID(change);
				}
				else if(att==5){
					book.setGenre(change);
				}
			}
		}
	}
	
	/**
	 * @param journal Created journal with all fields such as ID, name, field, date published etc.
	 * @param att an integer corresponding to the position of each field in the constructor class for Journal
	 * @param change the new value to be put into the chosen field
	 */
	public void UpdateResource(Journals journal, int att, String change){
		for (int i=0; i<inLibrary.size(); i++){
			if(inLibrary.get(i).getID() == journal.getID()){
				if (att == 1){
					journal.setAuthor(change);
				}
				else if(att==2){
					journal.setName(change);
				}
				else if(att==3){
					journal.setType(change);
				}
				else if(att==4){
					journal.setID(change);
				}
				else if(att==5){
					journal.setField(change);
				}
				else if(att==6){
					journal.setDate(change);
				}
			}
		}
	}
	
	/**
	 * @param doc Created Document with all fields such as ID, name, department of the government, date published etc.
	 * @param att an integer corresponding to the position of each field in the constructor class for Document
	 * @param change the new value to be put into the chosen field
	 */
	public void UpdateResource(GovernmentDocument doc, int att, String change){
		for (int i=0; i<inLibrary.size(); i++){
			if(inLibrary.get(i).getID() == doc.getID()){		
				if (att == 1){
					doc.setAuthor(change);
				}
				else if(att==2){
					doc.setName(change);
				}
				else if(att==3){
					doc.setType(change);
				}
				else if(att==4){
					doc.setID(change);
				}
				else if(att==5){
					doc.setDepartment(change);
				}
				else if(att==6){
					doc.setDate(change);
				}
			}
		}
	}
	
	/**
	 * @param person Person with all details including first and last names, phone number, email address and physical address
	 */
	public void RegisterPerson(Person person){
		if(CheckID(person)){
			members.add(person);
		}
	}
	
	/**
	 * @param person Person with all details including first and last names, phone number, email address and physical address
	 */
	public void DeletePerson(Person person){
		for(int i=0; i < members.size(); i++){
			if(members.get(i).getID() == person.getID()){
				members.remove(i);
			}
		}
	}
	
	/** 
	 * @param person Person with all details including first and last names, phone number, email address and physical address
	 * @param att integer value corresponding the place of each field as in the constructor class for Person
	 * @param change the new value for the chose field
	 */
	public void UpdatePerson(Person person, int att, String change){
		for (int i=0; i<members.size(); i++){
			if(members.get(i).getID() == person.getID()){		
				if(att==1){
					person.setFirstName(change);
				}
				else if(att == 2){
					person.setSurname(change);
				}
				else if(att == 3){
					person.setNumber(change);
				}
				else if(att==4){
					person.setEmail(change);
				}
				else if(att==5){
					person.setID(change);
				}
			}
		}				
	}
	
	/**
	 * @param person Person with all details including first and last names, phone number, email address and physical address
	 * @param address Address made up of 4 different String values
	 */
	public void UpdatePerson(Person person, Address address){
		person.setAddress(address);
	}
		
	/**
	 * @param resource Created Resource with all fields such as ID, name, type, author etc.
	 * @return the number of resources available with the same name as the given resource
	 */
	public int CheckAvailability(Resource resource){
		List<Resource> available = new ArrayList<Resource>();
		
		for (int i=0; i<inLibrary.size(); i++){
			if (inLibrary.get(i).getName() == resource.getName()){
				if(inLibrary.get(i).getAvailable() == true){
					available.add(inLibrary.get(i));
				}
			}
		}
		
		return available.size();
	}
	
	/**
	 * @param resource Created Resource with all fields such as ID, name, type, author etc.
	 * @return true if the resource ID isn't already taken and false if it is, to make sure all resources have unique identifiers
	 */
	public boolean CheckID(Resource resource){
		
		if (resource.getID().length()<10){
			return false;
		}
		else{
		
			List<Resource> usedID = new ArrayList<Resource>();
		
			for (int i=0; i<inLibrary.size(); i++){
				if (inLibrary.get(i).getID() == resource.getID()){
					usedID.add(resource);
				}
			}
		
			if (usedID.size() == 0){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	/**
	 * @param person Person with all details including first and last names, phone number, email address and physical address
	 * @return true if the person ID isn't already taken and false if it is, to make sure all members have unique identifiers
	 */
	public boolean CheckID(Person person){
		
		if (person.getID().length()<10){
			return false;
		}
		else{
		
			List<Person> usedID = new ArrayList<Person>();
		
			for (int i=0; i<members.size(); i++){
				if (members.get(i).getID() == person.getID()){
					usedID.add(person);
				}
			}
		
			if (usedID.size() > 0){
				return false;
			}
			else{
				return true;
			}

		}
	
	}
	
	public void ListLibrary(){
		if (inLibrary.size() > 0){
			for (int i = 0; i<inLibrary.size(); i++){
				System.out.println(inLibrary.get(i).getID()+ ", " + inLibrary.get(i).getName() + ", " + inLibrary.get(i).getAuthor() + ", " + inLibrary.get(i).getType());
			}
		}
		else {
			System.out.println("There is nothing in the Library");
		}

	}
	
	public void ListMembers(){
		if (members.size() > 0){
			for (int i = 0; i<members.size(); i++){
				System.out.println(members.get(i).getID()+ ", " + members.get(i).getFirstName() + ", " + members.get(i).getSurname() + ", " 
			+ members.get(i).getNumber() + ", " + members.get(i).getEmail());
				System.out.println(members.get(i).getAddress().getLine1() + ", " + members.get(i).getAddress().getLine2() + ", " + members.get(i).getAddress().getTown() + ", " + members.get(i).getAddress().getPostcode());
			}
		}
		else {
			System.out.println("There are no members");
		}

	}
}
