package basicPrograms;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year = sc.nextInt();
		if(year%4==0 && year%100 !=0 || year%400 ==0) {
			System.out.println("its a leap year");
		}else {
			System.out.println("its not a leap year");
		}
	}
}
