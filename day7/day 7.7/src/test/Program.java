package test;

import java.util.InputMismatchException;
import java.util.Scanner;

//divide by zero has to probable to occure.

public class Program {
	
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
	try {
		System.out.println("num1	:	");
		int num1=sc.nextInt();
		System.out.println("num2	:	");
		int num2=sc.nextInt();
		if(num2==0)
			throw new ArithmeticException("Divide by zero exception");

		int result=num1/num2;
		System.out.println("result	:	"+result);
	}
	
	catch (ArithmeticException | InputMismatchException ex)
	//multiple catch block via pipe operator
	{
		ex.printStackTrace();
	}
//	catch (InputMismatchException ex)
//	{
//		ex.printStackTrace();
//	}

	}
}
