package basicPrograms;

import java.util.Scanner;

public class CheckingPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r, sum=0;
		int temp = num;
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if(temp == sum){
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not palindrome");
		}
	}

}
