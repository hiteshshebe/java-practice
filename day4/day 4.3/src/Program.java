

/*class Math
{
    double PI;
    Math()
    {
        PI=3.14;
    }
}*/

/*class Math
{
    final double PI=3.14;

}*/
class Math
{
    final double PI;
    Math()
    {
        PI=3.14;
    }
}


class Program
{
    public static void main(String[] args) {
        Math m=new Math();
        
        System.out.println(m.PI);
    }
}