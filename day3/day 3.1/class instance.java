import java.io.Console;
class Complex
{
    int real;
    int img;
    /*Complex()//CONSTRUCTOR parameterless 
    {
        this.img=10;
        this.real=20;
    }
    */
    Complex(int x,int y)//parameterized constructor
    {
        this.real=x;
        this.img=y;
        
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
    public static void main(String[] args) 
    {
     Complex c1=new Complex(10,20);//parameterized constructor required values
     //c1.acceptRecord();
     c1.printRecord(); 
    //  Complex c2=new Complex();
    //  c2.printRecord(); 
    //  Complex c3=new Complex();
    // //c3.acceptRecord();
    //  c3.printRecord();   
    }
}