package Loops;

public class AdvancedPatterns {
    public static void main(String[] args) {

        // Advanced Pattern 5: Number Pyramid:
        // 1
        // 12
        // 123
        // 1234

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Matrix Representation:
        // (1,1)
        // (2,1) (2,2)
        // (3,1) (3,2) (3,3)
        // (4,1) (4,2) (4,3) (4,4)

        // 2. : Floyd's Triangle:
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // 0-1 Triangle:
        // 1
        // 01
        // 101
        // 0101

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }


        //Butterfly Pattern: 
        /*

         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *

         */

        int n = 4;

        // First Half
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second Half
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

