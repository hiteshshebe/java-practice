package test;

public interface A {
	int number=10;
	//public static final int number=10;
	void print();
	}
class B implements A //service provide
{
	public void print()
	{
		System.out.println("number   :"+A.number);
	}
}

class Program{
	public static void main(String[] args) {
		
		//service consumer
		B b = new B();
		b.print();
		A a=new B();
		a.print();
	}
}