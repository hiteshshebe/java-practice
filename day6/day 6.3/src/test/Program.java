package test;
import java.util.Scanner;
public class Program
{
	static Scanner sc= new Scanner(System.in);
	private static void printRecord(int[] number) 
	{
		if(number != null)
		{
			System.out.println("Number	:	");
			number[ 0 ]=sc.nextInt();
		}
		
	}
	private static void accpetrecord(int[] number) {
		if(number != null)
		{
			System.out.println("number	:	"+number);
		}
	}

	public static void main(String[] args) {
		
		int[] number = new int[ 1 ];
		Program.accpetrecord(number);
		Program.printRecord(number);
	}

	

	
}