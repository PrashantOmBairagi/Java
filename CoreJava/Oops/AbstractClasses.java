package CoreJava.Oops;

abstract class Parent {
    public abstract void abstractMethod();
}
class Child extends Parent {
    public void abstractMethod(){
        System.out.println("Child abstractMethod");
    }
}

public class AbstractClasses {


    static void main() {
        Parent p1 = new Child();
        p1.abstractMethod();
    }
}
