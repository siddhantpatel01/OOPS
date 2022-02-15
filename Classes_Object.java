import javax.print.DocFlavor.STRING;

// Classes and object and why uses this keyword
class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // user defined Constructer

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

class iphone {
    String name;
    String brand;
    String processor;
    String display;

    public void specification() {
        System.out.println(this.brand);
        System.out.println(this.display);
        System.out.println(this.name);
        System.out.println(this.processor);
    }
}

public class Classes_Object {

    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();
        Student s1 = new Student();
        s1.name = "Siddhant";
        s1.age = 18;

        Student s2 = new Student(s1);

        s1.printInfo(); //
        // iphone phone = new iphone(); // iphone() this is a constructor
        // phone.brand = "apple";
        // phone.display = "ratina";
        // phone.name = "iphone";
        // phone.processor = "A14";

        // phone.specification();

    }
}

