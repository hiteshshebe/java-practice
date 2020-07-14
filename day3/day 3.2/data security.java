class Account
{
    private String name;
    private int number;
    private float balance;
    Account()
    {}
    void setName(String name)
    {
    this.name=name;
    }
    void setnumber(int number)
    {
        this.number=number;
    }
    void setBalance(float balance)
    {
        this.balance=balance;
    }
}

class Program
{
    public static void main(String[] args) 
    {
     Account acc=new Account();
     acc.setName("hitesh");
     acc.setnumber(1213);
     acc.setBalance(65000);   
    }
}