package basicPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String name = "jayachandra";
		String result = "";
		//char[] reverse = name.toCharArray();
		for(int i = name.length()-1;i>=0;i--) {
			result = result+name.charAt(i);
			
		}
		System.out.println(result);
	}
}
