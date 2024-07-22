package basicPrograms;

public class Rajesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 12345;
//		int r,result =0;
//		while(num>0) {
//			r = num%10;
//			result = result*10+r;
//			num =  num/10;
//		}
//		System.out.println(result);
		
		String name= "jayachandra";
		String result="";
		for(int i=name.length()-1;i>=0;i--) {
			result = result+name.charAt(i);
		}
		System.out.println(result);
		
	}
}
		
		