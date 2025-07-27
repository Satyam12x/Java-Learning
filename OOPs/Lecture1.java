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

/*
What is an Object?
Definition: An object is an instance of a class. It occupies memory and has real values.

You can create multiple objects from one class.

Real-world Example:
myCar = new Car(); is like creating an actual Toyota Corolla with red color and 2022 model from the generic Car blueprint.
*/

//Code Example:
class Car {
    String color;
    String model;
    int year;

    void drive() {
        System.out.println(color + " " + model + " is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object creation
        myCar.color = "Red";
        myCar.model = "Corolla";
        myCar.year = 2022;

        myCar.drive();  // Output: Red Corolla is driving...
    }
}

/*
Procedural vs Object-Oriented Programming:

| Feature                         | Procedural Programming (e.g., C)  | Object-Oriented Programming (e.g., Java) |
| ------------------------------- | --------------------------------- | ---------------------------------------- |
| Structure                       | Divided into procedures/functions | Divided into classes and objects         |
| Data Handling                   | Data and functions are separate   | Data and methods are bundled in objects  |
| Reusability                     | Difficult to reuse code           | Promotes reuse through inheritance       |
| Security                        | Low — data is exposed globally    | High — data is encapsulated              |
| Real-world Modeling             | Hard to model                     | Easy to model with classes and objects   |
| Flexibility and Maintainability | Less modular                      | Highly modular and maintainable          |

*/

/*
Benefits of Using OOP in Java:

1. Real-World Mapping: Classes reflect real-world entities.

2. Code Reusability: Inheritance reduces duplication.

3. Security: Encapsulation protects internal object state.

4. Cleaner Code: Makes large applications easier to manage.

5. Better Testing & Debugging: Modular classes can be tested individually.

*/

//Practice Question Along With Homework:
// Ques1 : 
class A {
    int a;
    int b;
}

class Sum extends A {
    // Setter method to assign values
    public void setSatyam(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to print the sum
    public void printSum() {
        System.out.println(this.a + this.b);
    }
}

public class Main {
    public static void main(String[] args) {
        Sum m = new Sum();
        m.setSatyam(10, 20);
        m.printSum(); // Output: 30
    }
}

// Ques 2:
class Factorial {
    // Recursive method to calculate factorial
    public int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * fact(n - 1); // Recursive call
    }
}

public class Main {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int res = f.fact(5); // Calculate 5!
        System.out.println("Factorial of 5 is: " + res);
    }
}

//Homework Questions:

// 1. Create a class Student with fields name and marks, and print them.
// 2. Define a class Rectangle and calculate its area using length and width.
// 3. Implement a class Calculator with methods for add, subtract, multiply, divide.
// 4. Create a class Employee with a method to display name and salary.
// 5. Create a class with a method to return the square of a number.