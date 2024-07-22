package basicPrograms;

import java.util.Scanner;

public class CheckingPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("given string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev ="";
		int length = str.length();
		for(int i =length-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not palindrome");
		}
	}

}
