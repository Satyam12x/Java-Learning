//2-D Arrays: In Java, a two-dimensional (2D) array is an array of arrays, representing data in a tabular format with rows and columns. It is also commonly referred to as a matrix.

//Declaration of 2-D arrays:
//Type[][] arrayName; // Declaration
int[][] mat;

//Initialization of 2-D arrays:
//arrayName = new dataType[rows][columns]; // Initialization

mat = new int[5][5];

//Declaration and initialization in one step:
//dataType[][] arrayName = new dataType[rows][columns];
int[][] arr = new int[5][5];

//Initialization with values during declaration:
//dataType[][] arrayName = { {value1, value2}, {value3, value4} };
int[][] arr2 = {
    {
        1,2
    },
    {
        3,4
    }
};

//Initializing values in another method:
/*
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 7;
 */

/*
 // Print the values using index
        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[0][2] = " + arr[0][2]);
*/

//Accessing elements in the 2-D array:
//dataType value = arrayName[rowIndex][columnIndex];
##Lecture Day5:
//Now we will learn about how to iterate in 2-D arrays using loops and printing the output of the arrays.
/*
 - For 2-Dimensions we will be using 2 nested loops to iterate and print the array elements.
 - the first loop will be used to access the rows and the second loop will be used to access the columns.
 */
//Print an 2-D array:

//Code block
// int[][] arr = new int[2][2];
int[][] arr = {{1,2}, {3,4}};
for(int i=0; i<2; i++){ //first loop 'i' is used to iterate in the rows.
    for(int j=0; j<2; j++){ //second loop 'j' is used to iterate in the columns.
        System.out.print(arr[i][j]+" "); //printing the each element using the indexing method (read before).
    }
    System.out.println(); //used to move to the next line while all the rows in the respectuve row is completed.
}


//Taking input in 2-D arrays in java:

/*
- Taking input in the 2-D arrays are very similar as 1-d arrays.
- We just have to iterate using nested loops in the columns as well as rows.
- And after reaching all the indexes in the array we just have to take input using the Scxanner class.
*/

//Code Snippet:
Scanner s = new Scanner(System.in);
int[][] arr = new int[2][2];
for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
        arr[i][j] = s.nextInt();
    }
}

//Let's see the total implementation using a proper code block:

import java.util.*;
public class Day5{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows you want: ");
        int row = s.nextInt();
        System.out.println("Enter the number of columns you want: ");
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        //Taking input
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter the element at index: "+i + " " +j);
                arr[i][j] = s.nextInt();
            }
        }

        //printing the array:
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
