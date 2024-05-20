package ReverseAString;

import java.util.Scanner;

public class ReverseAString {

    public static String reverse(String original){
        //char[] orgArr = original.toCharArray();
        String reversed = "";
        for(int i = original.length()-1; i >= 0; i--){
            //reversed = reversed.concat(String.valueOf(original.charAt(i)));
            reversed = reversed+original.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String original = input.nextLine();
        String reversed = reverse(original);
        System.out.println(reversed);

    }
}
