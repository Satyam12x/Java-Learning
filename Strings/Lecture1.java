//Strings : In Java, a String is an object that represents a sequence of characters. It is one of the most fundamental and widely used classes in the java.lang package. 

//Declaration and initializationof String:

String name = "Satyam"; // Way - 1

String name = new String("Satyam"); //Way - 2

//In java, Strings are immutable means it cannot be changed. Once a String object is created, its value cannot be changed. Any operation that appears to modify a String (like concatenation or substring extraction) actually results in the creation of a new String object.

//Taking a string as input:
/*
- We can take string as input from the user with the help of Scanner class.
- using the inbuilt method .nextLine() and .next().
*/
String name = scanner.next(); //=> It reads characters from the input source until it encounters a delimiter. By default, whitespace characters (spaces, tabs, newlines, etc.) serve as delimiters.
String name = scanner.nextLine(); //=> used for taking more than one words or a line as input.

//Code Snippet of String declaration and input and output

import java.util.*;

public class Lecture1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstName;
        firstName = "Satyam";
        String lastName = s.nextLine();
        String slogan = s.nextLine(); // takes the full line.

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(slogan);
    }
}