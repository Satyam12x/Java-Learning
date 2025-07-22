//Practice Question on arrays:

/*
Ques 1. Take an array input from the user of size n, and print only     the elements at even index.
Ques 2. Take an array input from the user and duplicate the array.
Ques 3. You have given an array and you have to find the  highest       element in the array.
#Home Work: 
Ques 1. You have given an array, reverse it and print the reversed      array.
Ques 2. You have given an array, find the second highest element        present in the array.
*/

//Solutions:
//Ques 1:
import java.util.*;
public class Solution1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        //input
        for(int i=0; i<n; i++){
            System.out.println("Enter the element at index: "+i);
            arr[i] = s.nextInt();
        }
        //print the array
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}


//Ques 2:
import java.util.*;
public class Solution2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        //input
        for(int i=0; i<5; i++){
            System.out.println("Enter the element at index: "+i);
            arr[i] = s.nextInt();
        }
        //duplicating the array
        int duplicateArray[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            duplicateArray[i] = arr[i];
        }
        //printing the duplicated array
        System.out.println("Elements of duplicated array: ");
        for(int i=0; i<duplicateArray.length; i++){
            System.out.print(duplicateArray[i] + " ");
        }
    }
}

//Ques 3:
import java.util.*;
public class Solution3{
    public static void main(String args[]){
        int arr[] = {
            11, 31, 21, 8, 55, 43
        };
        int highest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>highest){
                arr[i] = arr[i]^highest;
                highest = arr[i]^highest;
                arr[i] = arr[i]^highest;
            }
        }
        System.out.println(highest);
    }
}