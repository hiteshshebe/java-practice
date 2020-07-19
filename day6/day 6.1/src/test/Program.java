package test;
class Complex
{
	public void print()
	{
	System.out.println("hello world");
	}
}


public class Program
{
	public static void main(String[] args)
	{
		Complex[] arr= new Complex[3];
		for(int index=0;index<arr.length;++index)
			arr[index]=new Complex();
		for(Complex c:arr)
			c.print();
		
	}
}