package NumberOfTimesADigitAppearing;

import java.util.Scanner;

public class NumberOfTimesADigitAppearing {
    public static int numberOfTimes(int number, int digit){
        String num = Integer.toString(number);
        String dig = Integer.toString(digit);
        int count=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)==dig.charAt(0)){
                count=count+1;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        number=input.nextInt();
        int digit;
        System.out.println("Enter the digit: ");
        digit=input.nextInt();
        int result = numberOfTimes(number, digit);
        System.out.println("The Number of times "+digit+" apprearing is: "+ result);
    }
}
