import bank.*;
// // 1. 1. Single inheritance : When one class inherits another class, it is
// //  known as single level inheritance

// class Shape {
//     public void area() {
//         System.out.print("display area");
//     }

// }

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println(1 / 2 * l * h);

//     }
// }
// public class Inheritances {
//     public static void main(String[] args) {

//    }

// }

// //  2. 3. Multilevel inheritance : Multilevel inheritance is a process of
// // deriving a class from another derived class.

// class Shape {
//     public void area() {
//         System.out.print("display area");
//     }

// }

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println(1 / 2 * l * h);

//     }
// }

// class EquilaterialTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1 / 2 * l * h);

//     }
// }

// public class Inheritances {
//     public static void main(String[] args) {

//     }

// }



// //  3. Hierarchical inheritance : Hierarchical inheritance is defined as the
// // process of deriving more than one class from a base class.

class Shape {
    public void area() {
        System.out.print("display area");
    }

}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);

    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class Inheritances {
    public static void main(String[] args) {
        // bank.Account account1= new bank.Account();
        // account1.name = "siddhant";

    }

}




// 4.   Hybrid inheritance : Hybrid inheritance is a combination of 
// simple, multiple inheritance and hierarchical inheritance.



// 5. multiple inheritance