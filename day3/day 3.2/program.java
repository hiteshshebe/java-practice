class Complex
{
    void printrecord()
    {
        System.out.println("complex.printRecord");

    }
}

class Program
{
    public static void main(String[] args) {
        Complex c1;
    }
    public static void main2(String[] args) {
        Complex c1=new Complex();
        c1.printrecord();
    }
    public static void main1(String[] args) {
        Complex c1=null;
        c1=new Complex();
        c1.printrecord();
    }
}