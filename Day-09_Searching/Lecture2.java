/*
 * 📘 BINARY SEARCH IN JAVA – FULL CLASS (Iterative)
 *
 * 📌 DEFINITION:
 * Binary Search is an efficient searching algorithm used on **sorted arrays**.
 * It repeatedly divides the array in half to find the key.
 *
 * 📌 PREREQUISITE:
 * - Array must be sorted in ascending order.
 *
 * 📌 TIME COMPLEXITY:
 * ✅ Best Case: O(1) – Middle element is the key
 * ✅ Worst/Average Case: O(log n)
 *
 * 📌 SPACE COMPLEXITY: O(1) – Iterative approach (no extra space used)
 *
 * 📌 USE CASE:
 * - Very fast for large sorted datasets
 */

public class Lecture2 {
    public static void main(String[] args) {
        // Sorted array
        int[] arr = {5, 10, 15, 20, 25, 30, 35};

        int key = 20; // Element to search

        int index = binarySearch(arr, key);

        // Output result
        if (index != -1) {
            System.out.println("✅ Element " + key + " found at index: " + index);
        } else {
            System.out.println("❌ Element " + key + " not found in the array.");
        }
    }

    /*
     * 🔍 BINARY SEARCH METHOD – Iterative
     * Takes sorted array and key as input
     * Returns index of key or -1 if not found
     */
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        // Loop until the search space is valid
        while (low <= high) {
            int mid = (low + high) / 2;

            // Print current comparison step
            System.out.println("🔄 Checking middle element: " + arr[mid]);

            if (arr[mid] == key) {
                return mid; // Key found
            } else if (arr[mid] < key) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Key not found
    }
}

/*
# Dry Run
Array: {5, 10, 15, 20, 25, 30, 35}
Key = 20

Step 1: mid = (0+6)/2 = 3 → arr[3] = 20  → Element found at index 3

#Time & Space Complexities:
Best Case: O(1)

Average/Worst: O(log n)

Space: O(1) (Iterative) or O(log n) (Recursive)
*/