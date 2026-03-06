package CoreJava.Oops;

public class Inheritance {
    static void main() {
        Student student = new Student("Prashant","Jabalpur",22,97,"A");
        student.display();
    }
}
class Person {
    public String name;
    public String address;
    public int age;
}

class Student extends Person{
    public int marks;
    public String grades;

    Student (String name, String address, int age, int marks,String grades) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grades = grades;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        System.out.println("Grades:" + grades);

    }
}

