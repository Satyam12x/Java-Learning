/*
#Introduction to Searching: 

- What is Searching?
Searching is the process of finding the position or existence of a desired element in a data structure (like array, list, etc.).

# Types of Searching:
- Linear Search (Sequential Search) – Checks each element one by one.

- Binary Search – Searches in a sorted array using divide-and-conquer.

- Interpolation Search, Jump Search, Exponential Search – Advanced search techniques (covered later).

# Factors to consider:

- Array sorted or unsorted?

- Time efficiency

- Space usage

- Applicability to large datasets

*/

/*
 * 📘 LINEAR SEARCH IN JAVA – FULL CLASS
 *
 * 📌 DEFINITION:
 * Linear Search is the simplest searching technique where we search for a key
 * element by checking each element in the array from left to right one-by-one.
 *
 * 📌 TIME COMPLEXITY:
 * ✅ Best Case: O(1) – Element is at the first position
 * ✅ Worst Case: O(n) – Element is at the last position or not present
 * ✅ Average Case: O(n)
 *
 * 📌 SPACE COMPLEXITY: O(1) – In-place, no extra memory used
 *
 * 📌 USE CASE:
 * - Works on both sorted and unsorted arrays
 * - Useful when the array is small or not sorted
 */

public class Lecture1 {
    // Main method to run the program
    public static void main(String[] args) {
        // Sample array for demonstration
        int[] numbers = {15, 23, 7, 41, 89, 6, 10};

        int key = 41; // Element we want to search

        // Call linear search function
        int result = linearSearch(numbers, key);

        // Print output based on result
        if (result != -1) {
            System.out.println("✅ Element " + key + " found at index: " + result);
        } else {
            System.out.println("❌ Element " + key + " not found in the array.");
        }
    }

    /*
     * 🔍 LINEAR SEARCH METHOD
     * Takes an array and a key to search
     * Returns index if found, else returns -1
     */
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            // Print current comparison (for understanding)
            System.out.println("🔄 Comparing " + key + " with " + arr[i]);

            if (arr[i] == key) {
                // Element found, return its index
                return i;
            }
        }

        // Element not found
        return -1;
    }
}


/*
 Dry Run Example:
Array: {15, 23, 7, 41, 89, 6, 10}
Key = 41

Compare 41 with 15 ❌

Compare 41 with 23 ❌

Compare 41 with 7 ❌

Compare 41 with 41 ✅ → Found at index 3
*/