package test;

class A
{
	public final void f1()
	{
		System.out.println("A.f1");//the other method arnt get modify in subclass
	}
}
class B extends A
{
//	public void f1()
//	{
//		System.out.println("B.f1");
//	}
}
public class Program {
	public static void main(String[] args) {
		
		A a=new A();
		a.f1();
		
		B b= new B();
		b.f1();
		
		
		
	}
}