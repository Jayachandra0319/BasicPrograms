package basicPrograms;

import java.util.Scanner;

public class Print_largest_number_untilEnterThe_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int max = 0;
		while(input>0) {
			if(input>0) {
				if(input>max) {
					max = input;
				}
			}else {
				System.out.println("data is not provided");
			}
			input = sc.nextInt();
		}System.out.println(max);
		
	}

}
