//Practice Questions:

// Practice Question 1: Reverse a String
// Question: Write a Java program to reverse a given string using both String and StringBuilder. Compare the two approaches.

/*
String Approach: Since Strings are immutable, we’ll create a new String by iterating through the characters backward or using StringBuilder internally.
StringBuilder Approach: StringBuilder has a built-in reverse() method, making it straightforward and efficient.
*/

//Solution:
import java.util.*;

public class  Lecture4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = s.nextLine();

        // Using String
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i); // Creates new String each time
        }
        System.out.println("Reversed using String: " + reversedString);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed using StringBuilder: " + sb);

        s.close();
    }
}

/*
Practice Question 2: Count Vowels in a String
Question: Write a Java program to count the number of vowels (a, e, i, o, u) in a given string using both String and StringBuilder.

Explanation:

String Approach: Iterate through the string’s characters and check for vowels.
StringBuilder Approach: Similar iteration, but we’ll use StringBuilder’s charAt() method for consistency.
Both approaches are similar in efficiency here since we’re not modifying the string, just reading it.
*/

//Solution 2:
import java.util.*;

public class Lecture4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to count vowels: ");
        String input = s.nextLine();

        // Using String
        int count = 0;
        String lowerInput = input.toLowerCase(); // Case-insensitive
        for (int i = 0; i < lowerInput.length(); i++) {
            char ch = lowerInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels using String: " + count);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(input.toLowerCase());
        int vowelCountSB = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCountSB++;
            }
        }
        System.out.println("Vowels using StringBuilder: " + vowelCountSB);

        s.close();
    }
}

/*
Practice Question 3: Build a Formatted String
Question: Write a Java program to create a formatted string like "Hello, [name]! Welcome to [place]." using String concatenation and StringBuilder. Take name and place as user input.

Explanation:

String Approach: Use + to concatenate strings, creating new String objects each time.
StringBuilder Approach: Use append() to build the string efficiently.
*/

//Solution 3:
import java.util.*;

public class Lecture4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Enter a place: ");
        String place = s.nextLine();

        // Using String
        String formattedString = "Hello, " + name + "! Welcome to " + place + ".";
        System.out.println("Using String: " + formattedString);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ").append(name).append("! Welcome to ").append(place).append(".");
        System.out.println("Using StringBuilder: " + sb);

        s.close();
    }
}


/*
1. Palindrome Checker:
Write a Java program to check if a user-input string is a palindrome (reads the same forward and backward, e.g., "radar").
Implement it using both String and StringBuilder.
Hint: Use String’s equals() or StringBuilder’s reverse().


2. Replace Vowels:
Write a Java program to replace all vowels in a user-input string with a ‘*’ character.
Implement it using both String (e.g., replaceAll()) and StringBuilder (e.g., replace() or setCharAt()).
Example: Input "Hello" → Output "Hll".


3. Word Capitalizer:
Write a Java program to capitalize the first letter of each word in a user-input sentence (e.g., "hello world" → "Hello World").
Implement it using both String (split into words, process each) and StringBuilder (manipulate characters directly).
Hint: Use split() for String, or track spaces in StringBuilder.
*/