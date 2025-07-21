/*
# Problem Statement:

- Design a Java program for a café where the user can:

1. Enter their name and select food items (tea, coffee, burger, etc.)

2. Choose quantity

3. See total cost including tax

4. Apply discounts if applicable

5. View final bill with GST

==> This project uses:

1. Variables and Data types

2. Typecasting for rounding total amount

3. Input/Output using Scanner

4. if-else for discount logic

5. switch for menu handling

6. Operators for calculations
*/

//#Hints:

public class ProjectDetails {

    public static void main(String[] args) {
        String hints[] = {
            "Take user’s name using Scanner and store it in a String variable.\n" ,
                                "Display a café-style menu with item numbers and prices.",
                                "Ask the user to enter the item number (1–5) and quantity.",
                                "Use switch to assign price based on item number.",
                                "Multiply price and quantity to get the subtotal.",
                                "Calculate GST as 18% of subtotal using subtotal * 0.18.",
                                "Add GST to subtotal to get the total bill amount.",
                                "If total bill is more than ₹100, apply 5% discount using if-else.",
                                "Subtract discount from total to get final amount to pay.",
                                "Use Math.round() for rounding GST, discount, and final amount.",
                                "Display subtotal, GST, total bill, discount, and final payable amount.",
                                "Print a thank-you message with the customer’s name."
        };
        System.out.println("Use the list of hints above to get the hints for the project.");
    }
}