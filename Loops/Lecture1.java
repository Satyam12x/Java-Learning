/*
1. Why Loops Are Used?
- Loops are used when we want to execute a block of code multiple times.
- Instead of writing repetitive code, we can write the logic once and use a loop to run it many times.

# Examples:

1. Print numbers from 1 to 100
2. Print a pattern
3. Run a program until a condition is false
4. Calculate sum or product of series of numbers

#Types of Loops in Java
- We have 3 types:

1. for loop (most commonly used)
2. while loop
3. do-while loop
*/

//1. For Loop:

//Syntax:
for (initialization; condition; update) {
    // code to be repeated
}

/*
1. Initialization: Run once at the start (e.g., int i = 1) => Here, you will initialize your iterative variable from where it has to start.

2. Condition: Checked before each iteration (loop continues if true) => Here, you will write the limits for the iterative variables to where to stop.

3. Update: Runs after each loop execution (e.g., i++) => Here, you will write whether your iterative variable will increase or decrease.
*/

//Example 1: Simple Example: Print 1 to 5:

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

//Example 2: Example: Print “Hello” 3 times:

for (int i = 1; i <= 3; i++) {
    System.out.println("Hello");
}

//Example 3: Print even numbers from 2 to 10:

for (int i = 2; i <= 10; i += 2) {
    System.out.println(i);
}

//For Loops Practice Questions:

/*
1. Print numbers from 50 to 60.

2. Print table of 7.

3. Print even numbers from 1 to 20.

4. Print numbers divisible by 3 from 1 to 30.

5. Print first 10 natural numbers in reverse order.
*/