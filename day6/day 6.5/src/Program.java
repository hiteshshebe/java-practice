//method overloading
public class Program {
	
	private static void sum(int ... arr)//variable argument function
	{
		int result=0;
		for(int element:arr )
		
			result=result+element;
		System.out.println("Result	:	"+result);
		
		
	}
	public static void main(String[] args) {
		sum(10,20,30,40,50);
	}
	
}
