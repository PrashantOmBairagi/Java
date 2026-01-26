//  22-JAN-2026 METHOD & METHOD OVERLOADING:

class Calculator
{
    public boolean add(int a,int b)
    {
        System.out.println("in CalC !");
        System.out.println(a+b);
        return true;
    }
   
    public boolean add(int a,int b,int c)
    {
        System.out.println("in CalC !");
        System.out.println(a+b+c);
        return true;
    }
    // we can have many methods of same name in java is called method overloading. but they must require different argument types exact copy wont work, thats OBV I guess!!
}

public class Method
{
    public static void main(String[] args)
    {
        int y=6;
        int z=9;

        System.out.println("in main!");

        Calculator obj = new Calculator();
        System.out.println("in main!  " + obj.add(y,z));
    }
}