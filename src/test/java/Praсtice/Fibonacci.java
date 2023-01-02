package Praсtice;

public class Fibonacci {
    public static void fibonacciNum( int numSequence){
        int count=0;
        int num1=0;
        int num2=1;
        int temp=0;

        while (count<numSequence){
            System.out.print(num1+" ");

           temp= num1+num2;
           num1=num2;
           num2=temp;
           count++;

        }
    }

    public static void main(String[] args) {
        fibonacciNum(10);
    }
}
