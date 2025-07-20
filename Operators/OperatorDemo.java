/*
Java Operators – In-Depth Guide for Beginners
# Introduction
- In Java, operators are symbols that perform operations on variables and values.
- They are essential to build logic, do calculations, make comparisons, and control flow in a program.

- Definition: Operators are the entities that are used to perform a specific operation on one or more than one operands.

Example: 
int sum = 10 + 5; here '+' is the addition operator which is adding 10 and 5.
 */

/*
 1. Arithmetic Operators
These are used for basic math operations like addition, subtraction, multiplication, etc.

# Operators:
+ (Addition)

- (Subtraction)

* (Multiplication)

/ (Division)

% (Modulus – remainder after division)

 Example:

int a = 15;
int b = 4;

System.out.println("Addition: " + (a + b));        // 19
System.out.println("Subtraction: " + (a - b));     // 11
System.out.println("Multiplication: " + (a * b));  // 60
System.out.println("Division: " + (a / b));        // 3
System.out.println("Modulus: " + (a % b));         // 3

- Division of integers returns only the whole number part.

2. Assignment Operators
These are used to assign values to variables.

# Operators:
= (Simple assignment)

+=, -=, *=, /=, %= (Shorthand operations)

 Example:

int x = 10;      // x is assigned 10
x += 5;          // x = x + 5 → 15
x *= 2;          // x = x * 2 → 30
System.out.println("x = " + x);  // Output: 30

These help you write shorter, cleaner code.

3. Relational (Comparison) Operators
These operators compare two values and return a boolean value (true or false).

# Operators:
== (Equal to)

!= (Not equal to)

> (Greater than)

< (Less than)

>= (Greater than or equal to)

<= (Less than or equal to)

 Example:

int a = 5, b = 10;

System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a < b);   // true
System.out.println(a >= b);  // false
These are often used in if-else statements and conditions.

4. Logical Operators
Used when you have to combine multiple conditions.

# Operators:
&& (Logical AND) → returns true if both conditions are true

|| (Logical OR) → returns true if any one condition is true

! (Logical NOT) → reverses the value of the condition

Example:

int age = 22;
boolean isStudent = true;

System.out.println(age > 18 && isStudent);  // true
System.out.println(age > 25 || isStudent);  // true
System.out.println(!isStudent);             // false


5. Unary Operators
Operators that work on a single operand.

# Operators:
+ (Unary plus)

- (Unary minus)

++ (Increment: adds 1)

-- (Decrement: subtracts 1)

Example:

int a = 5;

System.out.println(+a);   // +5
System.out.println(-a);   // -5

System.out.println(++a);  // Pre-increment → increases first, prints 6
System.out.println(a++);  // Post-increment → prints 6, then becomes 7
System.out.println(--a);  // Pre-decrement → 6
System.out.println(a--);  // Post-decrement → prints 6, then becomes 5


# 6. Ternary Operator
This is a shortcut for if-else. It evaluates a condition and returns a value.

# Syntax:

condition ? value_if_true : value_if_false;

Example:

int age = 17;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);  // Output: Minor

Very useful for writing simple decisions in one line.

# 7. Bitwise Operators (Intro-level)
Bitwise operators work on the binary representation of numbers. (Optional for beginners)

 Example:

int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b);  // AND → 0001 → 1
System.out.println(a | b);  // OR  → 0111 → 7
System.out.println(a ^ b);  // XOR → 0110 → 6


# Practice Program: Use of Multiple Operators

public class OperatorPractice {
    public static void main(String[] args) {
        int a = 8, b = 4;
        boolean status;

        int sum = a + b;
        int product = a * b;

        status = (sum > product) && (b != 0);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Is sum > product and b not zero? " + status);

        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("a is: " + result);
    }
}



= is like "putting something in a box" (assigning value).

== is like checking if two boxes have equal contents.



# Summary
1. Java offers a variety of operators to perform operations, compare values, and make decisions.

2. Operators are essential for logic building and are used in every real-world Java program.

3. Understanding these thoroughly will make learning conditions, loops, and functions much easier.
*/

//Code Snippet Example:

public class OperatorDemo {
    public static void main(String[] args) {

        // 👉 1. Arithmetic Operators
        int a = 10, b = 3;
        int sum = a + b;     // 13
        int diff = a - b;    // 7
        int prod = a * b;    // 30
        int div = a / b;     // 3 (integer division)
        int mod = a % b;     // 1 (remainder)

        // 👉 2. Assignment Operators
        int x = 5;
        x += 3;  // x = x + 3 → x = 8
        x *= 2;  // x = x * 2 → x = 16

        // 👉 3. Relational Operators
        boolean isEqual = (a == b);      // false
        boolean isGreater = (a > b);     // true
        boolean isLesser = (a < b);      // false

        // 👉 4. Logical Operators
        boolean condition = (a > b) && (x > 10);   // true && true = true
        boolean either = (b > a) || (x > 20);      // false || false = false
        boolean notEqual = !(a == b);              // !(false) = true

        // 👉 5. Unary Operators
        int c = 5;
        int preInc = ++c;   // 6 (increments first, then uses)
        int postInc = c++;  // 6 (uses first, then increments to 7)
        int preDec = --c;   // 6 (decrements first, then uses)
        int postDec = c--;  // 6 (uses first, then decrements to 5)

        // 👉 6. Ternary Operator
        String result = (a % 2 == 0) ? "Even" : "Odd";  // a = 10 → Even

        // 👉 7. Bitwise Operators
        int bitAnd = a & b; // 10 & 3 = 2 (1010 & 0011 = 0010)
        int bitOr = a | b;  // 10 | 3 = 11 (1010 | 0011 = 1011)
        int bitXor = a ^ b; // 10 ^ 3 = 9  (1010 ^ 0011 = 1001)

        // Printing All Results
        System.out.println("Arithmetic: + " + sum + ", - " + diff + ", * " + prod + ", / " + div + ", % " + mod);
        System.out.println("Assignment: x = " + x);
        System.out.println("Relational: == " + isEqual + ", > " + isGreater + ", < " + isLesser);
        System.out.println("Logical: && " + condition + ", || " + either + ", ! " + notEqual);
        System.out.println("Unary: ++pre " + preInc + ", post++ " + postInc + ", --pre " + preDec + ", post-- " + postDec);
        System.out.println("Ternary Result: " + result);
        System.out.println("Bitwise: & " + bitAnd + ", | " + bitOr + ", ^ " + bitXor);
    }
}

