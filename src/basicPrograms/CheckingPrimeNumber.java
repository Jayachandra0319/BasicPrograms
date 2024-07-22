package basicPrograms;

import java.util.Scanner;

public class CheckingPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is a not prime number");
		}
	}

}
