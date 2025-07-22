/*
# What are Loops?
- In programming, loops are control structures that allow you to execute a block of code multiple times as long as a specific condition is true.

They are used to:

1. Reduce code repetition.

2. Automate tasks like counting, searching, and input processing.

3. Improve readability and maintainability.

*/

/*
1. while Loop (Entry-Controlled Loop)
- Definition
A while loop is a control flow statement that executes a block of code repeatedly as long as the given condition evaluates to true.

- Syntax

while (condition) {
    // body of the loop
}

- Key Characteristics
1. Condition is evaluated before entering the loop.

2. If the condition is false initially, the loop never executes.

3. It is known as an entry-controlled loop.

- Flow of Execution

1. Evaluate condition
2. If true → execute loop body
3. After executing body → go back to Step 1
4. If false → exit loop


2. do-while Loop (Exit-Controlled Loop)
- Definition
A do-while loop is a control statement that executes the loop body first, and then checks the condition. This guarantees that the loop will execute at least once, even if the condition is false at the beginning.

- Syntax

do {
    // body of the loop
} while (condition);

- Key Characteristics
1. Body of the loop is executed before the condition is checked.

2. Executes at least once, no matter what the condition is.

3. It is known as an exit-controlled loop.
*/

/*
# Real-life Example Analogy: 

- while loop is like checking if there’s fuel before starting the car.

- do-while loop is like starting the car first and checking fuel later (the car will start once, even if fuel is low).

#  Summary:

1. Use while when you want to execute a loop only if a condition is already true.

2. Use do-while when you want to ensure the code runs at least once, regardless of the condition.
*/

//Example : User Login System Simulation: 
import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String enteredPassword;

        // --- Using do-while: Ensures the user gets at least one chance to login ---
        do {
            System.out.print("Enter your password: ");
            enteredPassword = sc.nextLine();
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access Granted!");

        // --- Using while: Count down from 5 to 1 only if condition is true ---
        int countdown = 5;
        System.out.println("System will exit in:");
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("System exited.");
        sc.close();
    }
}
