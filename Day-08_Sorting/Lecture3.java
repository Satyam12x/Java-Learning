/*
#Introduction to Selection Sort: 

~Concept:

- Selection Sort repeatedly selects the smallest (or largest) element from the unsorted portion of the array and places it at the beginning.

- It divides the array into two parts:

- Sorted part (at the beginning)

- Unsorted part (rest of the array)
*/

/*
# How it Works:

- Find the minimum element in the unsorted part.

- Swap it with the first element of the unsorted part.

- Repeat for the rest of the array.

# Dry Run Example:
Given array: {5, 3, 8, 4, 2}

Pass 1:
Find min in {5, 3, 8, 4, 2} → 2

Swap 2 with 5 → {2, 3, 8, 4, 5}

Pass 2:
Find min in {3, 8, 4, 5} → 3

No need to swap → {2, 3, 8, 4, 5}

Pass 3:
Find min in {8, 4, 5} → 4

Swap with 8 → {2, 3, 4, 8, 5}

Pass 4:
Find min in {8, 5} → 5

Swap with 8 → {2, 3, 4, 5, 8}
*/

//Code Snippet:
public class Lecture3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // Unsorted array

        selectionSort(arr); // Call the sorting method

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Selection Sort method
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop for each position in array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume current is min

            // Find the index of minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update index if smaller found
                }
            }

            // Swap the found minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

/*

# Time and Space Complexity:

- Best, Average, Worst Case: O(n²)

- Space Complexity: O(1) (in-place)

- Stable: ❌ No (can be made stable with modification)

- Adaptive: ❌ No

# When to Use:

- Simplicity matters over performance
- Memory is highly constrained
- Dataset is small and order is not a concern

*/