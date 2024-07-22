package basicPrograms;

import java.util.Scanner;

public class While_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//boolean is = true;
		int sum = 0;

		while(true) {
			System.out.print("enter number: ");
		
			int input = sc.nextInt();
		
			if(input !=0) {
			sum +=input;
			
		}else {
			System.out.println(sum);
			break;
		}
			
	}
	}

}
