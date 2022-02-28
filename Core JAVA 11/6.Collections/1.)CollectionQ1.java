package Collections;

import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionQ1 {
	String Name;
	String Email;
	String Gender;
	
	
	
	static Contact con = new Contact("Raj" , "raja@gmail.com","Male");
	static Contact con1 = new Contact("Aruna" , "arun@gmail.com", "Female");
	static Contact con2 = new Contact("Vishnu" , "vish@gmail.com","Male");
	
	

	public static void main(String[] args) {
		
		TreeMap<Long, Contact> tm = new TreeMap<Long, Contact>(Collections.reverseOrder());
		tm.put(88888L,con);
		tm.put(77777L, con1);
		tm.put(99999L, con2);
		
		
		 
	
		Set<Long> s =tm.keySet();
		System.out.println(" Key :"+s);
		
		System.out.println("---------");
		Collection<Contact> c = tm.values();
		System.out.println(" Value "+c);
		
		System.out.println("---------");
		
         System.out.println("Treemap :" +tm);
		
		
	     
	}

}

