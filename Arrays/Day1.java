//Arrays: In Java, an array is a container object that holds a fixed number of values of a single data type. It provides a way to store and manage a collection of elements efficiently under a single variable name. 

//How to declare and initialize arrays in java:

//array declaration:
//syntax: type[] arrayName;
int arr[];

//array initialization:
//Syntax: type[] arrayName = new type[size];
int arr2[] = new int[5];

//another method to declare and initialize the array:
int arr3[] = {
    1, 2, 3, 4, 5
};
/*
In java, arrays are zero-indexed, which means the first index will start from zero and go to n-1; where n is the number of elements present in the array.
*/
int arr4[] = {1,2,3,4,5};
/*
for clearance of indexing:
1 = 0-index
2 = 1-index
5 = 4-index(n-1)
*/

//Accessing an element in array:
arr4[1];
System.out.println(arr4[1]);
//Output = 2

//updating element using index:
arr4[1] = 10;
//Now the array becomes : {1,10,3,4,5}

//how to get array length by just a method:
arr4.length;
// (.length) = returns the total number of elements present in the array.
System.out.println(arr.length); //Output = 5


//Code Snippet for all these commands:
public class Day1{
    public static void main(String args[]){
        int testArray[] = {12, 23, 44, 11, 43, 98};
        //Access an element:
        System.out.println(testArray[2]);
        //output = 44
        //update an element:
        testArray[2] = 50;
        System.out.println(testArray[2]);
        //output = 50
        //get the length of array: expected output = 6
        System.out.println(testArray.length);
    }
}









