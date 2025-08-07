//In this lecture, we will learn about inheritance.

/*
# What is Inheritance?
- Inheritance is one of the core concepts of Object-Oriented Programming (OOP). It allows a class (called the child or subclass) to acquire the properties and behaviors (fields and methods) of another class (called the parent or superclass).

# Why Use Inheritance?

- Code Reusability

- Method Overriding

- Runtime Polymorphism

- Easier code maintenance and scalability
*/

class Parent {
    // fields and methods
}

class Child extends Parent {
    // additional fields and methods
}

// # Keyword 'extends' is used for inheritance.
/*
# Types of Inheritance in Java

Java supports the following types:

1. Single Inheritance

2. Multilevel Inheritance

3. Hierarchical Inheritance

- Java does NOT support Multiple Inheritance with classes to avoid ambiguity.
- But it supports Multiple Inheritance using Interfaces.
*/

/*
 # Single Inheritance in Java – Explained

- Concept:
Single Inheritance involves one parent class and one child class.

- Real-life Example:
Let’s say we have a class Animal, and a class Dog that inherits from Animal.
*/

//Code :
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited method
        d.bark(); // Own method
    }
}

# Practical Use Case of Inheritance: 
- Let’s take a University System

class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    void showCourse() {
        System.out.println(name + " is studying " + course);
    }
}

public class University {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amit";
        s.age = 20;
        s.course = "Computer Science";

        s.displayInfo(); 
        s.showCourse(); 
    }
}


/*
# Explanation:

We reused Person fields in Student.

Clean separation of general and specific properties.

Helpful in large systems like employee databases, e-commerce systems, etc.
*/

