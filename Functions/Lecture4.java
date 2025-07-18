//Practice Questions on Recursion : (Basic Level)

//Ques1 : Print numbers from 1 to 10:
public class Lecture4 {

    public static void printNumbers(int n){
        if(n==11){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNumbers(n); //n=1
    }
}

//Ques 2: Print numbers from 10 to 1:
public class Lecture4 {

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNumbers(n); //n=1
    }
}

//Ques 3: Print the sum of first n natural numbers:
public class Lecture4{
    public static void printSum(int sum, int i, int n){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        
        sum += i; //sum = 1
        printSum(sum, i+1, n);
    }
    public static void main(String[] args){
        printSum(0, 1, 10); // sum = 0; i = 1; n = 10
    }
}