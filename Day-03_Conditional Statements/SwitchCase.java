/*
1. What is a switch Statement?
- The switch statement in Java allows you to test the value of a variable against multiple options (cases) and execute different code blocks depending on which case matches.

- It is an alternative to the if-else-if ladder, and helps make the code cleaner and more readable when you are comparing a single variable against multiple constant values.
*/

//Syntax:

switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    ...
    default:
        // code block
}

/*
# Important Rules:
1. expression must result in byte, short, int, char, String (from Java 7+), or enum.

2. break is used to exit the switch after a match; otherwise, it falls through to the next case.

3. default is optional and runs if no match is found.
*/

// Example: Switch Case on Integer

int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    default:
        System.out.println("Invalid day");
}
// # Explanation:

// The value of day is compared to each case.

// Since day == 3, it matches case 3 → prints "Wednesday".

// The break ensures it exits after printing.

// 4. Example: Switch Case on String (Java 7+)

String fruit = "Mango";

switch (fruit) {
    case "Apple":
        System.out.println("Red Fruit");
        break;
    case "Mango":
        System.out.println("King of fruits");
        break;
    case "Banana":
        System.out.println("Yellow Fruit");
        break;
    default:
        System.out.println("Unknown fruit");
}
// 5. Example: Switch Without Break (Fall-through)

int x = 2;

switch (x) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
    default:
        System.out.println("Default");
}


// # Without break, all matching and next cases execute.

// 6. Example: Calculator Using Switch

int a = 10, b = 5;
char op = '+';

switch (op) {
    case '+':
        System.out.println("Sum = " + (a + b));
        break;
    case '-':
        System.out.println("Difference = " + (a - b));
        break;
    case '*':
        System.out.println("Product = " + (a * b));
        break;
    case '/':
        System.out.println("Quotient = " + (a / b));
        break;
    default:
        System.out.println("Invalid operator");
}


// 🎯 Use Cases of Switch:
// Menu-driven programs

// Selecting days/months

// Handling simple option-based inputs

// Replacing long if-else-if chains

