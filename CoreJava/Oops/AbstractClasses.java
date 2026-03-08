package CoreJava.Oops;

abstract class Parent {
    public abstract void abstractMethod();
}
class Child extends Parent {
    public void abstractMethod(){
        System.out.println("Child abstractMethod");
    }
}
abstract class Plane2 {
    public abstract void takeOff();

    public abstract void fly();
    public abstract void landing();
}

class CargoPlane2 extends Plane2{
    public void takeOff() {
        System.out.println("Cargo-Plane Take off...");
    }
    public void fly() {
        System.out.println("Cargo-Plane Flying...");
    }
    public void landing(){
        System.out.println("Cargo-Plane Landing...");
    }
}

class FighterPlane2 extends Plane2{
    public void takeOff() {
        System.out.println("Fighter-Plane Take off...");
    }
    public void fly(){
        System.out.println("Fighter-Plane Flying...");
    }
    public void landing(){
        System.out.println("Fighter-PlaneLanding...");
    }
}
class PassengerPlane2 extends Plane2{
    public void takeOff() {
        System.out.println("Passenger-Plane Take off...");
    }
    public void fly(){
        System.out.println("Passenger-Plane Flying...");
    }
    public void landing(){
        System.out.println("Passenger-Plane Landing...");
    }
}

class Airport2 {
    public void allowPlane(Plane2 obj) {
        obj.takeOff();
        obj.fly();
        obj.landing();
        System.out.println();
    }
}

public class AbstractClasses {
    static void main() {
        Parent p1 = new Child();
        p1.abstractMethod();

        Airport2 a1 = new Airport2();
        a1.allowPlane(new PassengerPlane2());
        a1.allowPlane(new CargoPlane2());
        a1.allowPlane(new FighterPlane2());
    }
}
