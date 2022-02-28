package Collections;

public class Contact {
	
	String Name;
	String Email;
	String Gender;
	
	public String toString()
	{
		
		return " : "   +this.Name+ "  : " +this.Email+ " :" +this.Gender;
		
	}
	public Contact(String Name, String Email, String Gender) {
		// TODO Auto-generated constructor stub
		this.Name = Name;
		this.Email = Email;
		this.Gender=Gender;
	}

}
