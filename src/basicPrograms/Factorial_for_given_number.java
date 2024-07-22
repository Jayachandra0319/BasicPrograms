package basicPrograms;

import java.util.Scanner;

public class Factorial_for_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact =1;
		for(int i=num;i>=1;i--) {
			fact = fact*i;
			
		}
		System.out.println(fact);
	}

}
