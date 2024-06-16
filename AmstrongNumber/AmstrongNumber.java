package AmstrongNumber;

import java.util.Scanner;

public class AmstrongNumber {
    public static void checkAmstrong(int number){
        String num=Integer.toString(number);
        int length = num.length();
        char[] nums = num.toCharArray();
        int sum=0;
        for(int i=0;i<num.length();i++){
            int a = nums[i]-'0';
            sum= (int) (sum+Math.pow(a,length));
        }
        if(sum==number){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not an Amstrong number");
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        number=input.nextInt();
        checkAmstrong(number);
    }
}
