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


import java.util.*;
public class Factorial {
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        return fibonacci(n-1)+fibonacci(n-2);
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





