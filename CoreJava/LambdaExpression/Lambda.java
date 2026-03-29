package CoreJava.LambdaExpression;

public class Lambda {
    static void main() {
    //------------------------------------------------------------------------------------
        //Anonymous class implementation of interface

        ILambdaInterface inter = new ILambdaInterface() {
            @Override
            public void print() {
                System.out.println("This is First anonymous class implementing.");
            }
        };
        inter.print();

        ILambdaInterface interface2 = new ILambdaInterface() {
            @Override
            public void print() {
                System.out.println("This is second anonymous class implementing.");
            }
        };
        interface2.print();
    //--------------------------------------------------------------------------------------
        // Lambda expression
        ILambdaInterface LambdaInter = () -> System.out.println("This is First time i'm implementing lambda.");
        LambdaInter.print();
        ILambdaInterface lambdaInter2 = () -> System.out.println("This is Second time i'm implementing lambda.");
    }
}
