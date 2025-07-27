package OOPs;

/*
Definition: Java is a high‑level, class‑based, object‑oriented programming language developed by Sun Microsystems in 1995. It is platform‑independent thanks to the Java Virtual Machine (JVM): “write once, run anywhere” 

Real‑world analogy: Think of Java as a DVD player and JVM as the DVD format reader that works on different operating systems. You write the code once (DVD), and as long as there's a JVM (player), it runs anywhere.
*/

// A Java program consists of one or more classes. Execution begins from the main(...) method, the single entry point.

public class Lecture1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
}


/*
 Introduction to Java OOPs
OOPs is a programming paradigm based on the concept of “objects”, which contain data (fields/attributes) and methods (functions/behaviors). Java is a pure object-oriented language, which means it uses the object-first approach to design applications.

Why OOP?

| Reason                | Explanation                                                              |
| --------------------- | ------------------------------------------------------------------------ |
| ✅ Real-world modeling | It mimics real-world entities like a `Car`, `Employee`, `BankAccount`.   |
| ✅ Modularity          | Code is organized into independent classes.                              |
| ✅ Reusability         | Inheritance allows using existing code in new ways.                      |
| ✅ Maintainability     | Smaller and isolated code units (objects) are easier to manage or debug. |
| ✅ Scalability         | Great for large and complex systems.                                     |
| ✅ Security            | Encapsulation hides internal data using private fields.                  |


What is a Class?
Definition: A class is a blueprint or template from which objects are created.

It defines properties (fields) and behaviors (methods).

Real-world Analogy:

A Car class is like a blueprint. It defines features like color, engineType, and actions like drive() or brake(), but it’s not a real car. Objects are the real cars built from this blueprint.
*/

class Car {
    String color;
    String model;
    int year;

    void drive() {
        System.out.println("Car is driving...");
    }
}
