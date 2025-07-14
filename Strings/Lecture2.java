// // Introduction to methods in Java:

// /*
// - The String class provides a rich set of methods for various operations, including:
// 1. Concatenation: It is used to combine two strings.
// 2. Comparison: Checking for equality using equals() or equalsIgnoreCase().
// 3. Manipulation: Allows to manipulate the String.
// */

// // Let's Have an example on this:

// //1. Concatenation:

// String firstName = "Satyam ";
// String lastName = "Pandey";
// String fullName = firstName + lastName;
// System.out.println(fullName);

//Expected output: Satyam Pandey

//2. 



import java.util.*;

public class Lecture2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstName = "Satyam ";
        String lastName = "Pandey";
        String fullName = firstName + lastName; //Concatenation
        System.out.println(fullName);

        //Get the length of the string:
        String str = "test";
        int a = str.length();
        System.out.println(a);

        //
    }
}