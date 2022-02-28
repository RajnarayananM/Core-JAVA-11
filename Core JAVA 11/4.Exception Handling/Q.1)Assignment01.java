package ExceptionHandle;

import java.util.Scanner;
public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		int results = 0;
		try {
			results = Num1/Num2;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("ArithmeticException is handled. Num 2 is 0 , Check Num 2");
			System.out.println("UnsupportedOperationException");
			e.printStackTrace();
			e.getMessage();
		}
	      System.out.println("Value of Results :"+results);
	        System.out.println("Program End");
		
		
	}
}



