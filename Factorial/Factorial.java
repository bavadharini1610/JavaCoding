package Factorial;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int number){
        if(number>=1){
            return number*factorial(number-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        number=input.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of "+number+" is: "+result);
    }
}
