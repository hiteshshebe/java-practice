import java.util.Scanner;
class Employee{
    String name;
    int empid;
    float salary;
    Employee(String nam,int eid,float sal)
    {
        this.name=nam;
        this.empid=eid;
        this.salary=sal;
    }
    Employee()
    {
        Employee(" ",0,0);
    }
    
    void printRecord()
    {
        System.out.printf("the name of employee is %s with employee id %d with salary %f ",name,empid,salary);

    }
}
class program {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.printRecord();
    }
    
}