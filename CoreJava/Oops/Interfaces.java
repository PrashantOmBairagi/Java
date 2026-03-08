package CoreJava.Oops;

interface ICalculator{
     void add(int a,int b);
     void sub(int a,int b);

}
interface IAdvCalculator extends ICalculator{
    void multiply(int a,int b);
    void divide(int a,int b);
}
class CalculatorImpl implements IAdvCalculator{

    public void add(int a, int b) {
        System.out.println("Addition is  : "+ (a+b));
    }
    public void sub(int a, int b) {
        System.out.println("Substract is : " + (a-b));
    }
    public void multiply(int a,int b){
        System.out.println("Multiply is  : " + a*b);
    }
    public void divide(int a,int b){
        System.out.println("Divide is    :  " + a/b);
    }
}

public class Interfaces {
    static void main() {
        ICalculator c = new CalculatorImpl();
        c.add(100,200);
        c.sub(100,20);
        IAdvCalculator a = new CalculatorImpl();
        a.multiply(10,20);
        a.divide(100,20);
    }
}
