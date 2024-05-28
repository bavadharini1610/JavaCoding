package SwapNumbersWithoutThirdVariable;

import java.util.Scanner;

public class SwapNumbers {

    public static void swap(int num1, int num2){
        num1= num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers to swap");
        num1=input.nextInt();
        num2=input.nextInt();
        swap(num1,num2);

    }
}
