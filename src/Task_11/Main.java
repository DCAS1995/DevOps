package Task_11;

public class Main {
	public static void main(String[] args){
		
	Library library = new Library();
	Book book = new Book("Jeff", "book#1", "book", "BK07289283", true, "horror");
	
	//Check that books can be added to the library
	library.AddResource((Resource)book);
	System.out.println("Adding Resource");
	library.ListLibrary();
	
    //Check that resources can be updated with a new attribute
	library.UpdateResource(book, 2, "book#2");
	System.out.println("Updating Resource");
	library.ListLibrary();
	
	//Remove book from library
	library.RemoveResource("BK07289283");
	System.out.println("Removing Resource");
	library.ListLibrary();
	
	
	//Create and register a new person in the members list
	Address address = new Address("22 Frost lane", "", "Manchester", "M16 3EJ");
	Person person = new Person ("bob", "stevens", "+447938299173", "bob.stevens@gmail.com","PN46720180182", address);

	library.RegisterPerson(person);
	System.out.println("Adding Person");
	library.ListMembers();

	
	//Update the person with a new address
	Address address2 = new Address("35 Sunny lane", "", "Manchester", "M19 4XZ");
	library.UpdatePerson(person, address2);
	System.out.println("Updating Member");
	library.ListMembers();
	
	//Remove the person from the members list
	library.DeletePerson(person);
	System.out.println("Deleting Person");
	library.ListMembers();
	
	
	}
}
