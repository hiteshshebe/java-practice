package test;

class Employee{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public boolean equals(Object obj)//method equals get override by unique empid which compare in both instance
	{
		if (obj!=null)
		{
			Employee other=(Employee) obj;
			if (this.empid==other.empid)
			{
				return true;
			}
			
			
		}
		return false;
	
	}
	public String toString()
	{
		return "Employee [name= " + name + ",empid= "+ empid + ",salary= " + salary + "]";
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp1=new Employee("sbc", 12, 15000);
		Employee emp2=new Employee("sbc", 12, 15000);
		if (emp1.equals(emp2))
			System.out.println("Equal");
		else
			System.out.println("not equal");//output equal to due to compare of state of variable.
	}

	
	
	public static void main1(String[] args) {
		Employee emp1=new Employee("sbc", 12, 15000);
		Employee emp2=new Employee("sbc", 12, 15000);
		if (emp1==emp2)
			System.out.println("Equal");
		else
			System.out.println("not equal");//output not equal to due to compare of state of variable
	}

}
