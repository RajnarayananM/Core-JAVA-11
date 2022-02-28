import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float SI;
		double CI;
		int p =sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		SI = p*n*r/100;
		CI = p*(Math.pow((1 + r / 100),n));
		System.out.println(+SI+ " = simple interest ");
		System.out.println(+CI+ " = Compound interest");

	}

}
