import sun.jvm.hotspot.runtime.StaticBaseConstructor;

class Test
{
    private int num1;
    private int num2;
    private static int num3;//sharedly access with all the instance
    //static initilizer block
    static
    {   System.out.println("inside the static initilaizer block");
        Test.num3=500;
    }
    Test(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;

    }

    void printRecord()
    {
        System.out.println("number :"+this.num1);
        System.out.println("number :"+this.num2);
        System.out.println("number :"+Test.num3);


    }
     
}

class Program
{   static
    {
    System.out.println("inside the static class block");
    }
    public static void main(String[] args) {
        System.out.println("inside the static main block");
        Test t1=new Test(10,20);
        t1.printRecord();
        Test t2= new Test(30,40);
        t2.printRecord();
        Test t3=new Test(50,60);
        t3.printRecord();
    }
}