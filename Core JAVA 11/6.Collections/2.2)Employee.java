package Collections;

import java.util.TreeSet;

public class Employee {
	     int id;
	     String Name;
	     String Department;
	     int Salary;

	
       static Employe e1 = new Employe(01, "Rana","Operations", 5000);
       static Employe e2 = new Employe(02, "zaj","IT", 1000);
       static Employe e3 = new Employe(03, "maj","PR", 3000);
       static Employe e4 = new Employe(04, "naj","HR", 6000);
       static Employe e5 = new Employe(05, "aaj","HM", 7000);
       static Employe e6 = new Employe(06, "yaj","Analyst", 9000);
       static Employe e7 = new Employe(07, "uaj","JS developer", 10000);
       static Employe e8 = new Employe(8, "iaj","Html", 500);
       static Employe e9 = new Employe(9, "oaj","css", 6700);
       static Employe e10 = new Employe(10, "haj","java", 3000);
    		   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employe> ts = new TreeSet<Employe>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		ts.add(e7);
		ts.add(e8);
		ts.add(e9);
		ts.add(e10);
		
		System.out.println(ts);
		

	}
	}


