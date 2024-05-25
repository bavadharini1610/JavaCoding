package NthFibonacciNumber;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacciNumber(int number){
        int fib;
        if(number<=1){
            return number;
        }
        fib = fibonacciNumber(number-1)+fibonacciNumber(number-2);
        return fib;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=input.nextInt();
        int result = fibonacciNumber(number);
        System.out.println("The "+number+"th fibonacci number is: "+result);
    }
}
