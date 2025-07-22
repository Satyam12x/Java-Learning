//Practice questions on 2-D arrays:(Do it yourself)

/*
Ques 1. WAP to take a 2-d array input from the user and then print that array in a matrix manner.
Ques 2. WAP to perform arithmatic operations on 2 matrices.
Ques 3. WAP to transpose a matrix.

#HomeWork:
Ques 1. WAP to search for an element in an array.
*/

//Solution 1:
public class Solution1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        // Get dimensions of the matrix
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt();
        
        // Declare 2D array
        int[][] matrix = new int[rows][cols];
        
        // Input elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = s.nextInt();
            }
        }
        
        // Print matrix
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        s.close();
    }
}

//Solution 2:

import java.util.*;
public class Solution2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = s.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = s.nextInt();

        // Input first matrix
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = s.nextInt();
            }
        }

        // Input dimensions for second matrix
        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = s.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = s.nextInt();

        // Input second matrix
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = s.nextInt();
            }
        }

        // Matrix Addition
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] sum = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            // Print result
            System.out.println("\nMatrix Addition Result:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix addition is not possible. Matrices must have the same dimensions.");
        }

        s.close();
    }
}

//Solution 3:
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input dimensions of the matrix
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = s.nextInt();
            }
        }

        // Create transpose matrix (swap rows and columns)
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print transpose matrix
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}