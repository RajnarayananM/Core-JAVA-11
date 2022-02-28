package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;




public class Assignment5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> assignment = Arrays.asList(
				new Fruit("Apple",50, 350, "Red"),
				new Fruit("Orange",200, 45, "Orange"),
				new Fruit("Graphes",300, 25, "Purple"),
				new Fruit("Puppaya",70, 50 ,"Yellow"),
				new Fruit("Pomo",45, 70 ,"Red"),
				new Fruit("Banana",1000,10, "Green"),
				new Fruit("Gova",30,80 ,"Blue")
				);
		  assignment.stream()
				  .filter(a->a.getCalories()<100)
				   .sorted((a1, a2)->a1.getName().compareTo(a2.getName()))
				   .forEach(a-> System.out.println(a.getName()));
		    
		   assignment.stream()
		    .sorted((a1, a2)->a1.getColor().compareTo(a2.getColor()))
		    .forEach(a-> System.out.println(a.getName()));
		
		    assignment.stream()
		              .filter(a->a.getColor().startsWith("R"))
		              .sorted(Comparator.comparingInt(Fruit::getPrice))
		              .forEach(a-> System.out.println(a.getName()));
		  
		             
		          
                   
		          
		     
		  
		     
				  
				   
				  
				   
						   
				   
		 
				 
	     

	}
	
	

}
