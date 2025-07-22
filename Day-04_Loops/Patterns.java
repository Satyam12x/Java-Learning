/*
# Why Learn Pattern Programs?

Pattern problems:

- Improve understanding of nested loops.

- Strengthen logic-building and dry-run skills.

- Are often asked in interviews and coding rounds
*/

package Loops;

public class Patterns {
    public static void main(String[] args) {
        // Basic Pattern 1: Solid Rectangle
        /*
        *****
        *****
        *****
        */
        for (int i = 1; i <= 3; i++) { // rows
            for (int j = 1; j <= 5; j++) { // columns
                System.out.print("*");
            }
            System.out.println();
        }

        // Matrix Logic:
        // (1,1) (1,2) (1,3) (1,4) (1,5)
        // (2,1) (2,2) (2,3) (2,4) (2,5)
        // (3,1) (3,2) (3,3) (3,4) (3,5)
        // Observation: Every cell prints *, so simple nested loops.

        // Basic Pattern 2: Right-Angled Triangle:
        // *
        // **
        // ***
        // ****

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Matrix Logic (Rows = i, Columns = j):
        // In row i, we print * i times.

        /*
         * (1,1)
         * (2,1) (2,2)
         * (3,1) (3,2) (3,3)
         * (4,1) (4,2) (4,3) (4,4)
         * 
         */

        // Intermediate Pattern 3: Inverted Triangle:
        /*
        ****
        ***
        **
        *
        */

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * (1,1) (1,2) (1,3) (1,4)
         * (2,1) (2,2) (2,3)
         * (3,1) (3,2)
         * (4,1)
         */

    }

}


/*
#Practice Questions: 
1. Intermediate Pattern 4: Right-Aligned Triangle:
   *
  **
 ***
****
*/