
class Student {
    String name;
    int age;

    // polymorphism
    // Compile time polymorphism 
    // method overloading

    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Polymorphisms {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Siddhant";
        s1.age = 24;
        s1.displayInfo(s1.name,s1.age);

    }

}