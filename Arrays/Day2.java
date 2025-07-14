//In today's session, we will learn how to take an array as inout from user and print an array.

/*
In java, we do input/output operation in array using loops(Specially for loop).
*/

//Print the elements of an array using for loop.

int arr[] = new int[5];
arr[1] = 10;
arr[2] = 20;
arr[3] = 30;
arr[4] = 40;
arr[5] = 50;

//print
for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]);//by this method, we will get out elements as output but in different lines.
    
    SYstem.out.print(arr[i] + " "); // by this method we will get our output in a good form.
}

//A short explaination: 
/*
As we know, thwe index in java array starts from 0. So, we will start traversing in the array with the help of an extra loop variable known as i(it can be any variable according to the needs and follow the protocols).
- Starting from 0, we will go to the length of the array means if the size of the array is 'n' then we will go to <n, which means we will cover all the elements.
- After that, from 0 to n, we will keep printing the array values at index i, when i = 0; it prints the value at 0 index and so on.
- As a result, we will get all the arry elements as an output.

- We can manipulate this traversal as per out needs.
*/


//How to take array as input from the user.
/*
- We will take input with the help of Scanner class.
- We will take the size of the array before the loop and iterate from starting to ending of the array.
- in the loop, by using array indexing, we will assign the input to the particular position of the array.(we will see the example).
*/

//input:
Scanner s = new Scanner(System.in); //Add the scanner class for input
int size; //take this inout from user
int arr2[] = new int[size]; //decalre the array

for(int i=0; i<size; i++){
    arr2[i] = s.nextInt();
}

//Code Snippet:
import java.util.Scanner;
public class Day2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        //taking input 
        for(int i=0; i<size; i++){
            System.out.println("Enter the value of index: " + i);
            arr[i] = s.nextInt();
        }
        
        //printing an array as output:
        System.out.println("The elements of the array are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Expected Output:
Enter the size of array: 
5
Enter the value of index: 0
12
Enter the value of index: 1
11
Enter the value of index: 2
10
Enter the value of index: 3
8
Enter the value of index: 4
68
The elements of the array are: 
12 11 10 8 68 
*/


