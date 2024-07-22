package basicPrograms;

public class Revrese_A_Number {
	public static void main(String[] args) {
		int num = 12345;
		int r = 0;
		int result = 0;
		while(num>0) {
			r = num%10;
			result = result*10+r;
			num /= 10;
		}
		System.out.println(result);
	}
}
