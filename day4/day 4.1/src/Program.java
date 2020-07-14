import Compl
class Program
{
    public static void main(String[] args) {
        
        Complex comp=new Complex(0,0);
        comp.setreal(10);
        comp.setimg(20);
        System.out.println("real number is     :"+comp.getreal);
        System.out.println("imaginary number is:"+comp.getimg);

    }
}