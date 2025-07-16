import java.util.*;
public class Factorial {
    public static int factorial(int n){
        int res = 1;
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int result = factorial(n);
        System.out.println("Factorial is: " + result); // Output: Factorial of 5 is: 120
    }
}