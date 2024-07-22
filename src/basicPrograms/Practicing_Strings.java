package basicPrograms;

import java.util.Scanner;

public class Practicing_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(1);
		if(ch>='a'&&ch<='z') {
			System.out.println("lowercase");
		}else {
			System.out.println("uppercase");
		}

	}

}
