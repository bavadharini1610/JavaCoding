package LengthOfStringWithoutLengthMethod;

import java.util.Scanner;

public class LengthOfString {

    public static int length(String text){
        char[] charArr = text.toCharArray();
        int count=0;
        for(char ch: charArr){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = input.nextLine();
        int length = length(text);
        System.out.println(length);

    }
}
