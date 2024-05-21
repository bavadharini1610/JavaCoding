package CountTheNumberOfDigitsInAInteger;

import java.util.Scanner;

public class CountTheNumberOfDigits {

    public static int countTheDigits(int number){
        String numStr = Integer.toString(number);
        int count;
        count = numStr.length();
        return count;

    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=input.nextInt();
        int count = countTheDigits(number);
        System.out.println(count);

    }
}
