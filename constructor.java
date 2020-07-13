import java.io.Console;
import java.util.Scanner;
class Complex
{
    int real;
    int img;
    Complex(int x,int y)//parameterized constructor
    {
        this.real=x;
        this.img=y;
        
    }

    Complex()//CONSTRUCTOR parameterless 
    {
        // this.img=10;
        // this.real=20;
        this(10,20);//constructor chaining explicitit call for parameterrized constructor
    }

    
    void initRecord()
    {
        this.img=10;
        this.real=20;
    }
    void acceptRecord()
    {
        Console cin = System.console();
        System.out.print("Real number is    :");
        this.real=Integer.parseInt(cin.readLine());
        System.out.print("imaginary number is   :");
        this.img=Integer.parseInt(cin.readLine());
    }
    void printRecord()
    {
        System.out.println("   "+real);
        System.out.println("   "+img);

    }
}
class Program
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//new scan method
        System.out.print("enter name    :");
        String name=sc.nextLine();
        System.out.print("enter roll no   :");
        int rollNo=sc.nextInt();
        System.out.print("enter marks   :");
        int marks=sc.nextInt();

        System.out.printf("%-10s %-5d %-5d",name,rollNo,marks);

    
}
     
}
