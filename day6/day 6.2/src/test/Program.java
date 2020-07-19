
// swap the two values of the dates by the write the swap method.


package test;
import java.util.Calendar;
public class Program
{
	private static void swap(Date[] arr)
	
	{
		Date temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;

	}
	public static void main(String[] args) {
		Date d1 =new Date( 4,7,1998 );
		Date d2 =new Date( 10,5,2020 );
		date[] arr= { d1 , d2 };
		Program.swap(arr);
		System.out.println(d1);
		System.out.println(d2);
	}
	public static void main1(String[] args)
	{
		Calendar c = Calendar.getInstance();
		int day=c.get(c.DATE);
		int month=c.get(c.MONTH);
		int year=c.get(c.YEAR);

		System.out.println(day+"/"+month+"/"+year);
	}
}