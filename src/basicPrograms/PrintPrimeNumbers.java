package basicPrograms;

import java.util.Scanner;

public class PrintPrimeNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		for(int j=num1;j<=num2;j++) {
			count =0;
			 for(i=1;i<=j;i++) {
			if(j%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(j);
			}
		}
	}

}
