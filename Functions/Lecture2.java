
/*
Topic - Methods with Return Type
 - These methods return a value to the caller using the return keyword. The return type must match the type declared in the method signature.
 # Methods help in -
 - These methods perform a task and return a value to the caller.
 - The return type is not void, and it must match the type of value returned using the return statement.
 - Useful when we need the output of a calculation or some processed value.
 */

public class Circle {
// Method with return type (double)
// Calculates the area of a circle given its radius
   public static double calculateArea(double radius) {
        double area = 3.14 * radius * radius; // Area formula
        return area; // Returning the area as a double
    }
}

public static void main(String[] args) {
    double result = Circle.calculateArea(5.0); // Calling method with return
    System.out.println("Area: " + result);
}


/*
 expected output - 
 Area: 78.5
 */

/*
Topic - Methods with No Return Type (void)
  - These methods perform an action but do not return any value. The return type is void, which means "no value returned."
  # Methods help in - 
  - These methods perform an action but do not return any value.
  - The return type is declared as void.
  - Typically used for printing messages, updating UI, logging, etc.
 */

 public class Printer {
// Method with no return (void)
// Just prints the message to the console
   public void printMessage(String message) {
   System.out.println(message);
   }
}

public static void main(String[] args) {
    Printer p = new Printer(); // Creating object
    p.printMessage("Welcome to Java!"); // Calling void method
}

/*
 expected output - 
 Welcome to Java!
 */