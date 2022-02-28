import java.util.*;
public class Armstrongcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int arm=0,rem;
		while (num !=0)
		{
			rem = num%10;
			arm = arm + rem*rem*rem;
			num = num/10;
		}
		if (arm == temp)
		System.out.println(temp + "is Armstrong Number");
		else 
			System.out.println(temp + "is not an Armstrong Number");

	}

}

