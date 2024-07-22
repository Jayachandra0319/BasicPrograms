package basicPrograms;

import java.util.Scanner;

public class PrintNumberOneToTen {
	public  static void oneToTen(int initialNum,int finalNum)
	{
		for(int i=initialNum;i<=finalNum;i++){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial Number");
		int initialNum = sc.nextInt();
		System.out.println("Enter final Number");
		int finalNum = sc.nextInt();
		oneToTen(initialNum,finalNum);
	
	}

}
