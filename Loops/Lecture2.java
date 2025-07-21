package Loops;

public class Lecture2 {
    public static void main(String[] args) {
        // # Practice Questions on Loops:

        // 1. Check if a Number is Prime or Not:

        int num = 29;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }

        // 2. Print All Prime Numbers from 1 to 100:
        for (int num2 = 2; num2 <= 100; num2++) {
            boolean isPrime2 = true;
            for (int i = 2; i <= num2 / 2; i++) {
                if (num2 % i == 0) {
                    isPrime2 = false;
                    break;
                }
            }
            if (isPrime2)
                System.out.print(num2 + " ");
        }

        // 3. Print Fibonacci Series up to n Terms:

        int n = 10;
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        // 4. Find Factorial of a Number:
        int num3 = 6;
        long fact = 1;

        for (int i = 1; i <= num3; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}


/*
# Practice Questions:

1. Print the sum of all prime numbers between 1 and 100.
2. Check whether a number is a palindrome or not (e.g., 121, 12321).
3. Print a pattern of stars in pyramid shape (for n = 5 rows).
4. Find the LCM of two numbers using loops.
5. Reverse the digits of a given number using loop.
*/