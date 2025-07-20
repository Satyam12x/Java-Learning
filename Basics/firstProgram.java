/*
# Introduction: Java is a high-level, object-oriented programming language known for its platform independence (Write Once, Run Anywhere - WORA). To begin learning Java, writing your first program is the perfect starting point.


 */

public class firstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World! ");
    }
}

/*
#Explaination of code:
1. public class FirstProgram : Declares a class named FirstProgram. In Java, every application must contain a class. The file name must match the class name (case-sensitive).

2. { ... } : Curly braces define the start and end of a class or method block.

3. public static void main(String[] args) : This is the main method – the entry point of any Java application.

4. public : Access modifier – means this method is accessible from anywhere.

5. static :	It allows the JVM to call the method without creating an object.

6. void : It means the method does not return any value.

7. String[] args : It's an array used to receive command-line arguments.

8. System.out.println("Hello, World!"); : Prints the string "Hello, World!" to the console. It adds a new line after printing.
 */

/*
# How to Compile and Run
1. Save the file as FirstProgram.java

2. Open terminal/command prompt.

3. Compile: javac FirstProgram.java

4. Run: java FirstProgram
*/

/*
Key Points:
1. The file name must match the public class name.

2. Java programs always start from the main() method.

3. System.out.println() is used to print output.

4. Java is case-sensitive (main, Main, and MAIN are different).
*/