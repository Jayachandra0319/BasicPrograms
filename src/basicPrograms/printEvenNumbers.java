package basicPrograms;

import java.util.Scanner;

public class printEvenNumbers {
	public static void evenNumbers(int startingNum, int endingNum) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				
				System.out.println(i);	
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int startingNum = sc.nextInt();
		System.out.print("Enter the ending number : ");
		int endingNum = sc.nextInt();
		System.out.println("Even numbers between 1 to 10 ");
		evenNumbers(startingNum,endingNum);
	}

}
