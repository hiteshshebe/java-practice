package test;

abstract class A//abstract class cannot create a instance
{
	public final void f1()
	{
		System.out.println("A.f1");
	}
	public void f2()
	{
		System.out.println("A.f2");
	}
	public abstract void f3();
}
final class B extends A //you cannot extend new class
{	@Override
	public final void f3()//abstract method mandator to override to the sub class
	{
		System.out.println("B.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		
		A a=new B();
		a.f1();
		a.f3();
		a.f2();
		
		B b= new B();
		b.f2();
		
		
		
	}
}