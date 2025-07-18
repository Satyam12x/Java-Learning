/*
Recursion : Recursion in Java is a programming technique where a method calls itself to solve a problem. This approach is effective when a problem can be broken down into smaller, similar subproblems. 

Base Case: This is a condition that stops the recursion. It defines the simplest instance of the problem that can be solved directly without further recursive calls. Without a base case, a recursive method would lead to an infinite loop.

Recursive Steps : This is where the method calls itself with a modified input, moving closer to the base case.


# Advantages of Recursion:
- Readability: For certain problems (like tree traversals or fractal generation), recursive solutions can be more intuitive and easier to understand than iterative ones.
- Conciseness: Recursive code can often be more compact than its iterative counterpart.

# Disadvantages of Recursion:
- Performance Overhead:
Each recursive call adds a new frame to the call stack, which can lead to increased memory usage and potential StackOverflowError for deep recursions.
- Debugging Complexity:
Tracing the execution flow of recursive methods can be more challenging than iterative loops.
*/

//Example 1: Factorial of a number: 
import java.util.*;
public class Factorial {
    public static int factorial(int n){
        int res = 1;
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int result = factorial(n);
        System.out.println("Factorial is: " + result); // Output: Factorial of 5 is: 120
    }
}

//Example 2: Print the fibonacci series upto n terms:
import java.util.*;
public class fibonacci {
    public static int Fibonacci(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        int n = s.nextInt();// Find the 6th Fibonacci number (0-based index)
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n)); // Output: 8
        // Print first n+1 numbers in the series
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

//Example 3: Print the table of a given number: 
public class MultiplicationTable {
    public static void printTable(int number, int multiplier) {
        // Base case: stop after multiplier reaches 10
        if (multiplier > 10) {
            return;
        }
        // Print current multiplication
        System.out.println((number * multiplier));
        // Recursive case: call with next multiplier
        printTable(number, multiplier + 1);
    }

    public static void main(String[] args) {
        int number = 5; // Change this to any number for its table
        System.out.println("Multiplication table for " + number + ":");
        printTable(5, 1); // Start with multiplier 1
    }
}