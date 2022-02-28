package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> hs = new HashSet();
		  hs.add("Raj");
		  hs.add("Rana");
		  hs.add("Vishnu");
		  hs.add("Sara");
		  hs.add("Rio");
		  hs.add("Ragow");
		  hs.add("Dara");
		  hs.add("vara");
		  hs.add("gana");
		  hs.add("flora");
		  hs.add("Raj");
	 System.out.println(hs.add("Rio"));
		  System.out.println("Hashset :"+hs);
		  
		   TreeSet<Integer> ts = new TreeSet();
		      ts.add(78);
		      ts.add(23);
		      ts.add(56);
		      ts.add(12);
		      ts.add(67);
		      ts.add(10);
		      ts.add(80);
		      ts.add(45);
		      ts.add(67);
		      ts.add(23);
		      
		      System.out.println("Treeset :"+ts);
		      
		      ArrayList<Integer> al = new ArrayList();
				al.add(10);
				al.add(20);
				al.add(30);
				al.add(40);
				al.add(50);
				al.add(60);
				al.add(70);
				al.add(80);
				al.add(90);
				al.add(20);
				
				System.out.println("Arraylist :"+al);
				
			
	}

}
