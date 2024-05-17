package PrimeNumber;

import java.util.Scanner;

public class Prime {
    public static boolean isNumberPrime(int number){
        for(int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                return false;
            }
        }
            return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if(number<=1){
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = isNumberPrime(number);

        // print result based on whether the number is prime or not
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
