package basicPrograms;

import java.util.Scanner;

public class Average_of_N_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num,count=0,res=0;
		while(true) {
			num = sc.nextInt();
			if(num !=0) {
				res +=num;
				count++;
			}else {
				System.out.println(res/count);
				break;
			}
			
		}
			
		
	}

}
