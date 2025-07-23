/*

#Introduction to bubble sort : 

~ Concept:

- Bubble Sort is a simple comparison-based sorting algorithm.

- It repeatedly compares adjacent elements and swaps them if they are in the wrong order.

- With each pass, the largest element "bubbles up" to its correct position at the end.


# Dry Run Example:
- For array: {5, 3, 8, 4, 2}

- Pass 1:
Compare 5 and 3 → swap → {3, 5, 8, 4, 2}

Compare 5 and 8 → no swap

Compare 8 and 4 → swap → {3, 5, 4, 8, 2}

Compare 8 and 2 → swap → {3, 5, 4, 2, 8}

- Pass 2:
Compare 3 and 5 → no swap

Compare 5 and 4 → swap → {3, 4, 5, 2, 8}

Compare 5 and 2 → swap → {3, 4, 2, 5, 8}

... and so on, until sorted.
*/

//Code Snippet :
public class Lecture2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};  // Unsorted array

        bubbleSort(arr); // Call the sorting method

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort method
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: to stop if already sorted

            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps in this pass, array is already sorted
            if (!swapped) break;
        }
    }
}

/*
# Time and Space Complexity:

- Best Case: O(n) (when array is already sorted)

- Average/Worst Case: O(n²)

- Space Complexity: O(1) (in-place)

- Stable Sort: ✅ Yes

- Adaptive: ✅ Yes (if optimized with the swapped flag)

*/