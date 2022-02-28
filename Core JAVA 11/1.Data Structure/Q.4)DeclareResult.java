import java.util.Scanner;

public class DeclareResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       if (a>60 || b>60) {
    	   System.out.println("Failed");
       }
       else if(c>60) {
    	   System.out.println("Failed");
       }
       else if((a+b+c)>60) {
    	   System.out.println("Passed");
       }
       else if ((a+b) >60 || (b+c)>60) {
    	   System.out.println("Promoted");
       }
       else if ((a+c)>60) {
    	   System.out.println("Promoted");
       }
       else if ((a+b+c)<60) {
    	   System.out.println("Failed");
       }
       
	}

}
