//method overloading
public class Program {
	
	private static void sum(int num1,int num2)
	{
		int result=num1+num2;
		System.out.println(result);
	}
	private static void sum(int num1,int num2,int num3)
	{
		int result=num1+num2+num3;
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		sum(10,20);
		sum(10,20,30);
	}
	
}
