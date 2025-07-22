/*
#Data Types: In Java, every variable has a data type, which determines the size and type of values it can hold. Data types are essential for memory management and performance in your programs.

Java provides two main categories of data types:

1. Primitive Data Types
These are the most basic data types and are built into the Java language. There are 8 primitive data types in Java.

a. byte: Used to store very small integers, typically useful in memory-saving situations. Example:

byte a = 100;

b. short: Slightly larger than byte. Used when int is too large and memory saving is required.

short b = 10000;

c. int: Commonly used to store whole numbers.

int age = 21;

d. long: Used for very large whole numbers. You must append L to the value.

long population = 1000000000L;

e. float: Used for decimal values but with less precision. Add f at the end.

float pi = 3.14f;

f. double: More precise than float and commonly used for decimal numbers.

double gravity = 9.81;

g. char: Used to store a single character. Characters are enclosed in single quotes.

char grade = 'A';

h. boolean: Used to store true or false values.

boolean isJavaFun = true;

2. Non-Primitive Data Types
These are more complex and can hold multiple values. Examples include String, Array, Class, Object, etc.

a. A String is a sequence of characters, and it's widely used for textual data. Example:

String name = "Satyam";
 */

public class DataTypeDemo {

    public static void main(String[] args) {

        // 🔹 Primitive Data Types
        byte myByte = 100;
        short myShort = 32000;
        int myInt = 100000;
        long myLong = 10000000000L;

        float myFloat = 3.14f;
        double myDouble = 3.1415926535;

        char myChar = 'A';
        boolean myBoolean = true;

        // Printing primitive data types
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        // 🔸 Non-Primitive Data Types

        // String
        String myString = "Hello, Java!";
        System.out.println("String: " + myString);

        // Array
        int[] myArray = {10, 20, 30, 40};
        System.out.println("Array Element [0]: " + myArray[0]);
    }
}


/*
# TypeCasting in java; 
Type casting means converting one data type into another. It is used when you need to perform operations between incompatible types or when you want to control the type conversion.

There are two types of casting in Java:

🔹 Implicit Type Casting: 
In implicit casting, Java automatically converts a smaller data type to a larger one. This is safe and does not require manual intervention.

For example:

int num = 10;
double result = num;  // int is automatically converted to double
System.out.println(result);  // Output: 10.0

Here, int is automatically widened to double.

🔸 Explicit Type Casting:
In this case, you convert a larger data type into a smaller one manually. This is called narrowing and may cause data loss.

Example:

double price = 99.99;
int newPrice = (int) price;  // You must cast explicitly
System.out.println(newPrice);  // Output: 99

In the above code, the decimal part is removed when converting double to int.
*/
//Example: 
public class CastingExample {
    public static void main(String[] args) {
        int x = 42;
        double y = x;  // Implicit casting (int to double)
        System.out.println("Implicit Casting: " + y);

        double a = 89.75;
        int b = (int) a;  // Explicit casting (double to int)
        System.out.println("Explicit Casting: " + b);
    }
}


// Conclusion
// Java supports various data types that help in efficiently storing and managing data. Type casting allows converting one data type into another for flexibility and performance. While implicit casting is safe and automatic, explicit casting must be handled with care to avoid data loss.
