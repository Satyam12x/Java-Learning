// // Introduction to methods in Java:

// /*
// - The String class provides a rich set of methods for various operations, including:
// 1. Concatenation: It is used to combine two strings.
// 2. Comparison: Checking for equality using equals() or equalsIgnoreCase().
// 3. Manipulation: Allows to manipulate the String.
// */

// // Let's Have an example on this:

// //1. Concatenation:

String firstName = "Satyam ";
String lastName = "Pandey";
String fullName = firstName + lastName;
System.out.println(fullName);

//Expected output: Satyam Pandey 

//There are so many methods that are applicable on strings, you guys can check them by typing '.' after the string name.
//Code Snippet:
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

        //Get the character at any index:
        String name = "Satyam";
        name.charAt(0); //expected output = S

        //Convert the string into upper/lower case:
        String name2 = "Satyam";
        name2 = name2.toUpperCase();
        System.out.println(name2); //expected output = SATYAM
        name2 = name2.toLowerCase();
        System.out.println(name2); //expected output = satyam
    }
}