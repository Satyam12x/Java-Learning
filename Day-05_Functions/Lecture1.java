/*
Functions: Fucntion is a block of code which performs specific task.
- In Java, functions are called methods. A method is a block of code designed to perform a specific task and is associated with a class or an  object.
# Methods help in:
- Code Reusability: Write once, use multiple times.
- Modularity: Break down complex programs into smaller, manageable pieces.
- Abstraction: Hide implementation details and expose only functionality.
- Methods can return a value or perform an action without returning anything (void).
*/

/*
# A method in Java has the following components:

- Access Modifier: Defines the visibility (e.g., public, private, protected).
- Return Type: Specifies what the method returns (e.g., int, String, void for no return).
- Method Name: A meaningful name following camelCase convention.
- Parameters: Input values (optional) passed to the method.
- Method Body: The code block that defines the method’s functionality.
- Return Statement: (Optional) Returns a value to the caller if the return type is not void.
*/

/*
#Syntax of functions in java:

accessModifier returnType methodName(parameterType parameterName, ...) {
    // Method body
    // Code to perform the task
    return value; // If returnType is not void
}
*/
//Example :
public static int addTwoNumbers(int num1, int num2){
    return num1 + num2;
}
//Example:
public static int addTwoNumbers(int num1, int num2){
    int sum = num1 + num2;
    return sum;
}

/*
- In java, methods can be called using both objects and directly the class. It depends on how you are making it. We will study about it in detail in next lecture.
*/

//How to make a function/Method:

//Method Declaration: It specifies the method’s signature, including its name, return type, parameters, and access modifier, without the method body.

accessModifier returnType methodName(parameterType parameterName, ...);

public int calculateSum(int a, int b);

//Method Initialization: It provides the method’s implementation (body) where the actual logic is written. For non-void methods, a return statement is required if a value is expected.

accessModifier returnType methodName(parameterType parameterName, ...) {
     Method body (logic)
    return value; // Required if returnType is not void
}

public int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;
}

//Method Calling: Invoking the method to execute its logic.

//# Instance Methods: Require an object of the class to be called.
//Example:
ClassName obj = new ClassName();
obj.methodName(arguments);

//#  Static Methods: Called using the class name, no object needed.
//Example:
ClassName.methodName(arguments);

//Example:
// For instance method
Calculator calc = new Calculator();
int result = calc.calculateSum(5, 3); // Calls calculateSum, returns 8

// For static method
Calculator.printMessage("Hello"); // Calls static method

//Code Snippet:
public class Calculator {
    // Method Declaration and Initialization (Instance Method)
    public int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Method Declaration and Initialization (Static Method)
    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Main method to demonstrate calling
    public static void main(String[] args) {
        // Create object for instance method
        Calculator calc = new Calculator();

        // Calling instance method
        int sum = calc.calculateSum(10, 20);
        System.out.println("Sum: " + sum);

        // Calling static method
        Calculator.printMessage("Welcome to Java!");
    }
}