/*
#Input and Output in Java – With Theory and Examples
Introduction: 

Input and output are fundamental concepts in any programming language. They allow the user to interact with the program.
In Java:

1. Output is displayed using System.out (standard output).

2. Input is taken using the Scanner class from java.util (standard input).

* Java uses the System.out stream to send output to the console.

# Syntax:

System.out.println("message");
System.out.print("message");


1. println() prints the message and moves to a new line.

2. print() prints the message on the same line.
 */

//Example:
public class OutputExample {
    public static void main(String[] args) {
        System.out.print("Hello \n"); //'\n' is used to move to the next line.
        System.out.print("World!");
        System.out.println(); // moves to next line
        System.out.println("Welcome to Java!");
    }
}

//Printing variables:
int age = 21;
String name = "Satyam";

System.out.println("My name is " + name);
System.out.println("I am " + age + " years old.");



//You can also use formatted output using printf():
double marks = 95.5;
System.out.printf("Your score is %.2f out of 100\n", marks);

/*
# Input in Java Using Scanner
- To take input from the user, Java provides the Scanner class.


# Step-by-Step
1. Import the Scanner class

import java.util.Scanner; //on the first line of your code

2. Create a Scanner object

Scanner s(can be any name) = new Scanner(System.in);

3. Use methods to take input: 

nextInt() → for integers

nextDouble() → for floating point numbers

nextLine() → for full line of text

next() → for single word

nextBoolean() → for true/false input

 */

 //Taking input from user:
 import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        float height = sc.nextFloat();

        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " ft");
    }
}


/*
nextLine() and Input Issue:

- If you use nextInt() or nextFloat() followed by nextLine(), the newline character remains in the input buffer and causes the nextLine() to skip.

 Example 4: Problematic Input Sequence

 System.out.print("Enter age: ");
int age = sc.nextInt();

System.out.print("Enter your city: ");
String city = sc.nextLine(); // This might get skipped!

#Solution:
int age = sc.nextInt();
sc.nextLine();  // consume the newline
String city = sc.nextLine();

 */

 //Input of all common data type:
 import java.util.Scanner;

public class AllInputTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your roll number (int): ");
        int roll = sc.nextInt();

        System.out.print("Enter your marks (double): ");
        double marks = sc.nextDouble();

        sc.nextLine();  // clear the buffer before nextLine()

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.print("Are you present today? (true/false): ");
        boolean isPresent = sc.nextBoolean();

        System.out.println("\n--- Details ---");
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + fullName);
        System.out.println("Present: " + isPresent);
    }
}

/*
#Practice Homework Questions:
1. Write a program that asks the user for their name and year of birth, then prints their age.

2. Create a program that accepts 3 subject marks, calculates the average, and prints it.

3. Ask the user to enter their full name, city, and whether they are a student (boolean), then display it all neatly.
 */