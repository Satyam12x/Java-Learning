/*
1. Introduction to Conditional Statements:
- Conditional statements in Java allow the program to take decisions and perform different actions based on different conditions. These decisions are made using boolean expressions that return true or false.

# Why Conditional Statements?
Imagine you’re designing a system to check:

- If a person can vote (based on age),

- Whether a number is even or odd,

- Which grade a student gets based on marks.

These situations require decision-making—which is exactly what conditional statements help us do.
*/

//Types of If-Based Conditional Statements

/*
1. if Statement
The if statement executes a block of code only if the condition evaluates to true.

*/

//Example:
int age = 20;

// This block runs only if age is 18 or above
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}

// If age < 18, nothing will be printed.

//Explanation:

// The condition inside if (condition) is evaluated.

// If the condition is true, the code block inside {} executes.

// If false, Java skips the block.

/*
2. if-else Statement
When you want to execute one block if condition is true and another if it is false, use if-else.
*/
int num = 7;

if (num % 2 == 0) {
    System.out.println("Even Number");
} else {
    System.out.println("Odd Number");
}
/*
Explanation:

- % is the modulus operator, which gives remainder.

- If num % 2 == 0, it means number is divisible by 2 → even.

- If not, it goes to the else part → odd.

3. if-else-if Ladder
When there are multiple conditions to check, use this ladder.
*/
int marks = 82;

if (marks >= 90) {
    System.out.println("Grade: A+");
} else if (marks >= 80) {
    System.out.println("Grade: A");
} else if (marks >= 70) {
    System.out.println("Grade: B");
} else if (marks >= 60) {
    System.out.println("Grade: C");
} else {
    System.out.println("Fail");
}
/*
Explanation:

- Java checks each condition from top to bottom.

- As soon as one condition is true, the rest are skipped.

- If none match, the final else is executed.

4. Nested if Statement
An if inside another if. Useful when you need to validate multiple levels of conditions.
*/
int age = 25;
int weight = 55;

if (age > 18) {
    // Only if age > 18, this condition will be checked
    if (weight > 50) {
        System.out.println("Eligible to donate blood");
    } else {
        System.out.println("Not eligible due to weight");
    }
} else {
    System.out.println("Not eligible due to age");
}
/*
Explanation:

- The outer if checks age.

- The inner if only runs if the outer one is true.

- This structure is useful for hierarchical or dependent conditions.

5. Ternary Operator (Shortcut for if-else)
This is a compact form of if-else. Good for simple conditions.
*/
int number = 10;

// Syntax: condition ? result_if_true : result_if_false
String result = (number % 2 == 0) ? "Even" : "Odd";
System.out.println(result);
/*
Explanation:

- Checks if number is even.

- If true → assigns "Even", otherwise → "Odd".

Key Takeaways:

- Always use {} with if and else, even for single-line blocks (for better readability).

- Be cautious with nested if — keep it clear with indentation.

- if-else-if ladder is good for range checks (like grading).

- Use ternary operator only for simple conditions, not complex logic.

*/

//Code Snippet:
public class ifElse {
    public static void main(String[] args) {
        
        // --- 1. if Statement ---
        int age = 20;
        if (age >= 18) {
            System.out.println("1. if: You are eligible to vote.");
        }

        // --- 2. if-else Statement ---
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("2. if-else: " + num + " is Even");
        } else {
            System.out.println("2. if-else: " + num + " is Odd");
        }

        // --- 3. if-else-if Ladder ---
        int marks = 65;
        if (marks >= 90) {
            System.out.println("3. if-else-if: Grade A+");
        } else if (marks >= 75) {
            System.out.println("3. if-else-if: Grade A");
        } else if (marks >= 60) {
            System.out.println("3. if-else-if: Grade B");
        } else if (marks >= 45) {
            System.out.println("3. if-else-if: Grade C");
        } else {
            System.out.println("3. if-else-if: Fail");
        }

        // --- 4. Nested if Statement ---
        int weight = 55;
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("4. nested if: Eligible for blood donation.");
            } else {
                System.out.println("4. nested if: Not eligible due to low weight.");
            }
        } else {
            System.out.println("4. nested if: Not eligible due to age.");
        }

        // --- 5. Ternary Operator ---
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("5. ternary: " + number + " is " + result);
    }
}
