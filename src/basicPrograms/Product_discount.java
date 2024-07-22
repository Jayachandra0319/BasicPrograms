package basicPrograms;

import java.util.Scanner;

public class Product_discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("product price");
		int price = sc.nextInt();
		System.out.println("product discount");
		int discount = sc.nextInt();
		int disc_price = (price)*discount/100;
		int total_price = price - disc_price;
		System.out.println(total_price);
	}

}
