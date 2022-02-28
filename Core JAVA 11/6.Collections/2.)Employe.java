package Collections;

public class Employe {
	int id;
	String Name;
	String Department;
	int Salary;
	
	public String toString()
	{
		
		return " " +this.id+  " : "   +this.Name+ "  : " +this.Department+ " :" +this.Salary;
		
	}
	public Employe(int id, String Name, String Department, int Salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.Name = Name;
		this.Department = Department;
		this.Salary=Salary;

}
}
