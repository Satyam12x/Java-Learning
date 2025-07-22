
/*
#Practice Questions:
1. Calculate area and perimeter of a rectangle given length and breadth.

2. Swap two numbers using a third variable.

3. Swap two numbers without using a third variable.

4. Check whether a number is even or odd using modulus operator.

5. Find the largest of three numbers using ternary operator.

6. Classify a person based on age (Child, Teen, Adult, Senior) using logical operators.

7. Calculate grade from average of 5 subjects using relational operators.

8. Check if a number is positive, negative, or zero using if-else.

9. Evaluate bitwise AND, OR, XOR of two numbers.

10. Demonstrate pre-increment and post-increment behavior.
*/

//Solution 1:
import java.util.Scanner;

public class RectangleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}


//Solution 2:
public class SwapWithThird {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

//Solution 3:
public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 5, b = 7;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;  // a = 12
        b = a - b;  // b = 5
        a = a - b;  // a = 7

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

//Solution 4:
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}

//Solution 5:
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        // Nested ternary operator to find largest
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Largest number is: " + largest);
    }
}


//Note: Do the questions 6-10 as your homework.