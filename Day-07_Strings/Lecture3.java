//Introduction to StringBuilder:
//StringBuilder: The StringBuilder class in Java is a mutable sequence of characters, belonging to the java.lang package. It provides an efficient way to manipulate strings, especially when frequent modifications are required.

//StringBuilder is mutable, Unlike the String class, which creates new objects for every modification, StringBuilder allows in-place changes to its character sequence, leading to better performance and memory efficiency during extensive string operations.

/*
- append(): Adds characters or the string representation of an object to the end of the sequence.
- insert(): Inserts characters or a string at a specified index.
- delete(): Removes characters within a specified range.
- replace(): Replaces a portion of the sequence with a new string.
- reverse(): Reverses the order of characters in the sequence.
- capacity(): Returns the current capacity of the StringBuilder.
- length(): Returns the number of characters in the sequence.
*/
//Let's see all these methods with the help of an example:
//Code Snippet :

import java.util.*;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sam = new StringBuilder("Hello! "); // Initialization and declaration of a StringBuilder variable

        // 1. append(): Adds text to the end of the StringBuilder
        sam.append("SkillShastra.");
        System.out.println("After append: " + sam); // Expected output: Hello! SkillShastra.

        // 2. insert(): Inserts text at a specific index
        sam.insert(7, "Namaste ");
        System.out.println("After insert: " + sam); // Expected output: Hello! Namaste SkillShastra.

        // 3. delete(): Removes characters from startIndex to endIndex
        sam.delete(7, 15); // Note: endIndex is 15 because "Namaste " is 8 characters long (7 to 14 inclusive)
        System.out.println("After delete: " + sam); // Expected output: Hello! SkillShastra.

        // 4. replace(): Replaces characters from startIndex to endIndex with new text
        sam.replace(7, 19, "World"); // Replaces "SkillShastra" with "World"
        System.out.println("After replace: " + sam); // Expected output: Hello! World

        // 5. reverse(): Reverses the entire character sequence
        sam.reverse();
        System.out.println("After reverse: " + sam); // Expected output: dlroW !olleH

        // 6. capacity(): Returns the current capacity of the StringBuilder
        System.out.println("Capacity: " + sam.capacity()); // Expected output: likely 22 or higher (depends on default capacity)

        // 7. length(): Returns the number of characters in the StringBuilder
        System.out.println("Length: " + sam.length()); // Expected output: 12 (dlroW !olleH has 12 characters)
    }
}

/*
Why to use StringBuilder?
- StringBuilder is mutable, allowing changes without creating new objects.
- It’s faster than String for frequent modifications, especially in loops.
- It saves memory by modifying text in place, reducing object creation.
- Offers versatile methods like append, insert, delete, replace, and reverse.
- Ideal for dynamically building strings, like from user input or files.
*/