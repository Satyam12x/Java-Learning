/*
What is a Variable?
A variable in Java is a named memory location used to store data during program execution.
It allows you to store values and reuse them in your program.
*/

//Syntax of Variable Declaration:
dataType variableName = value;

// Example:
int age = 20;
String name = "Satyam";
/*
Types of Variables in Java
Type:
1. Local Variable: Declared inside a method/block, Scope:	Within that block only
2. Instance Variable: Declared inside a class, but outside any method	, Scope: Object-level
3. Static Variable:	Declared with static keyword, Scope: Class-level (shared among all objects)


Example:
public class Example {
    static int staticVar = 10;      // Static variable
    int instanceVar = 20;          // Instance variable

    public void display() {
        int localVar = 30;         // Local variable
        System.out.println("Static: " + staticVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Local: " + localVar);
    }
}

*/

//Mini-Practice Task:
public class VariablePractice {
    public static void main(String[] args) {
        int year = 2025;
        String name = "Satyam";
        double height = 5.9;

        System.out.println(name + " was born in " + (year - 21));
        System.out.println("Approx height: " + height);
    }
}


//Conclusion:
// Variables store data for use in the program.

// Java has three types of variables: local, instance, and static.

// Always use proper naming and data types.