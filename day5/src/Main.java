import java.util.Scanner;

import Com.sunbeam.java.Complex;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Complex Comp)
	{
		System.out.println("Real number     :");
		Comp.setReal(sc.nextInt());
		System.out.println("Real number     :");
		Comp.setImg(sc.nextInt());
		
	}
	private static void printRecord(Complex C1)
	{
		System.out.println(C1.toString());
	}
	public static int menulist()
	{
		System.out.println("0:Exit");
		System.out.println("1:Accept record");
		System.out.println("2:print record");
		return sc.nextInt();
		
	}
	public static void main(String[] args) {
		
		int choice;
		Complex c2 =new Complex();
		while((choice=Main.menulist())!=0)
			switch(choice)
			{
			case 1:
				Main.acceptRecord(c2);
			case 2:
				Main.printRecord(c2);
			}
	
		
	}

}
