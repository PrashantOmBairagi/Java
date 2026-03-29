package CoreJava.MethodReference;

public class RefDemo {
    static void main() {
    // Iworking is the anonymous class but the function implemented is other function already present somewhere that's why we [REFERRED] it.
    // RULE:-  {Class name} :: {Method name}  (for static methods)
        IWorking working = Stuff::doStuff;
        working.doWork();
        // successfully referred
    //------------------------------------------------------


    //RULE:- {object name} :: {Method name} (for non-static methods)
        Stuff stuffObj = new Stuff();
        IWorking work2 = stuffObj::doStuffNotStatic;
        work2.doWork();
    }
}
