import java.util.Arrays;   
public class arraysort {

	public static void main(String[] args) {
      int [] array = new int [] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};  
        Arrays.sort(array);   
        System.out.println("Elements of array sorted in ascending order: ");  
       for (int i = 0; i < array.length; i++)   
         {       
          System.out.println(array[i]);   
         }   

	    }

    }
