package CoreJava.Oops;
// 07-MARCH-2026 This is the best explanation of METHOD OVERRIDING under DYNAMIC-POLYMORPHISM where type of planes inherit methods from PARENT PLANE and OVERRIDE in accordance of their use.

class Plane{
    public void takeOff(){
        System.out.println("Take off...");
    }
    public void fly(){
        System.out.println("Flying...");
    }
    public void landing(){
        System.out.println("Landing...");
    }
}

class CargoPlane extends Plane{
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

class FighterPlane extends Plane{
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
class PassengerPlane extends Plane{
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

class Airport {
    public void allowPlane(Plane obj) {
        obj.takeOff();
        obj.fly();
        obj.landing();
        System.out.println();
    }
}

public class DynamicPolymorphism {
    static void main() {
        Plane p = new PassengerPlane();
        Plane c = new CargoPlane();
        Plane f = new FighterPlane();
        Airport a = new Airport();
        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);

    }
}
