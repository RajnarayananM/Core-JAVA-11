import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long ctc =sc.nextLong();
		if (ctc <180000){
			System.out.print("Tax Amount Nill");
			
		}
		else if (ctc>180001 &&  ctc < 300000){
			double tax1 =(ctc*10)/100;
			System.out.print (tax1);
		}
		else if (ctc>300001 && ctc < 500000){
			double tax2 = (ctc*20)/100;
			System.out.println (tax2);
		}
		else {
			double tax3=(ctc*3)/100;
			System.out.println(tax3);
		}
	}

}
