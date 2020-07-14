class Account
{
    private String name;//data hiding 
    private int number;//if we declear any filed private called as data hiding
    private float balance;
    Account(String n,int num,float bal)
    {
        this.name=n;
        this.number=num;
        this.balance=bal;
    }
}
class Program
{
    public static void main(String[] args) {
        Account acc=new Account("hitesh", 27, 56000f);
        // System.out.println(acc.balance);
    }
}