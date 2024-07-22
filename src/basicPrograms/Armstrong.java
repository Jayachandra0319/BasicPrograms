package basicPrograms;

public class Armstrong {
	
	public static void armstrongNum(int num)
	{ int count=0;
	int num1=num;
		while(num1>0)
		{
			count++;
			num1=num1/10;
		}
		
		int sum=0;
		while(num>0)
		{
			int x=num%10;
			sum=sum+cube(x,count);
			//sum=sum+x*x*x;
			num=num/10;
		} 
		System.out.print(sum);
	}
	public static int cube(int num,int y)
	{
		int cubeValue=1;
		while(y>0)
		{
			cubeValue=cubeValue*num;
			y--;
			
		}
		return cubeValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			armstrongNum(153);
			//int x=cube(5,5);
			//System.out.println(x);
		
	}

}
