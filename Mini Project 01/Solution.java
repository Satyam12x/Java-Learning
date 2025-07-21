import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Variables and Data Types
        String customerName;
        int itemChoice, quantity;
        double price = 0, subtotal, gst, discount = 0, total, finalAmount;

        // Input
        System.out.print("Enter your name: ");
        customerName = s.nextLine();

        // Menu using switch
        System.out.println("\n------ MENU ------");
        System.out.println("1. Tea       - ₹10");
        System.out.println("2. Coffee    - ₹20");
        System.out.println("3. Burger    - ₹50");
        System.out.println("4. Pizza     - ₹100");
        System.out.println("5. Sandwich  - ₹40");

        System.out.print("\nEnter item number: ");
        itemChoice = s.nextInt();

        System.out.print("Enter quantity: ");
        quantity = s.nextInt();

        // Switch case to assign price
        switch (itemChoice) {
            case 1: price = 10; break;
            case 2: price = 20; break;
            case 3: price = 50; break;
            case 4: price = 100; break;
            case 5: price = 40; break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Operators and calculations
        subtotal = price * quantity;
        gst = subtotal * 0.18; // 18% GST
        total = subtotal + gst;

        // If-else for discount
        if (total > 100) {
            discount = total * 0.05; // 5% discount
        }

        finalAmount = total - discount;

        // Typecasting for neatness
        finalAmount = Math.round(finalAmount * 100.0) / 100.0;
        gst = Math.round(gst * 100.0) / 100.0;
        discount = Math.round(discount * 100.0) / 100.0;

        // Output
        System.out.println("\nSubtotal: ₹" + subtotal);
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Total Bill: ₹" + total);
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
        System.out.println("\nThank you, " + customerName + "! Visit again.");
    }
}