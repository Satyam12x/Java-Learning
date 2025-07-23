/*
#Introduction to Insertion Sort: 

~ Concept:

- Insertion Sort builds the sorted array one element at a time.

- It picks the next element and inserts it into the correct position in the already sorted part (just like sorting playing cards in your hand).

# Working Mechanism:

- Start from the second element.

- Compare it with the elements before it.

- Shift all larger elements one position to the right.

- Insert the current element at the correct position.

# Dry Run Example:

Unsorted array: {5, 3, 8, 4, 2}

Pass 1:
Key = 3, compare with 5 → shift 5 → insert 3

Result: {3, 5, 8, 4, 2}

Pass 2:
Key = 8 → already in correct position

Result: {3, 5, 8, 4, 2}

Pass 3:
Key = 4 → compare with 8, shift → compare with 5, shift → insert at correct position

Result: {3, 4, 5, 8, 2}

Pass 4:
Key = 2 → shift 8, 5, 4, 3 → insert at start

Result: {2, 3, 4, 5, 8}
*/

//Code Snippet: 
public class Lecture4 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // Unsorted array

        insertionSort(arr); // Call the sorting method

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Insertion Sort method
    static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift right
                j--;
            }

            // Insert key at the correct position
            arr[j + 1] = key;
        }
    }
}

/*
# Time and Space Complexity:
- Best Case: O(n) (when array is already sorted)

- Average/Worst Case: O(n²)

- Space Complexity: O(1) (in-place)

- Stable: ✅ Yes

- Adaptive: ✅ Yes

# When to Use:
- Best for small or nearly sorted datasets

- Easy to implement and understand

- Useful in online sorting (data comes in chunks)
*/