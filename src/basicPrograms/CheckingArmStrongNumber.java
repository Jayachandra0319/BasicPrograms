package basicPrograms;

public class CheckingArmStrongNumber {

	public static void main(String[] args) {
		int num=153,originalnum,result=0,remainder;
		 originalnum = num;
		 while(originalnum!=0) {
			 remainder = originalnum%10;
			 result+= Math.pow(remainder, 3);
			 originalnum /= 10;
		 }
		 if(result==num) {
			 System.out.println("armstrong number");
		 }else {
			 System.out.println("not a armstrong number");
		 }
	}

}
