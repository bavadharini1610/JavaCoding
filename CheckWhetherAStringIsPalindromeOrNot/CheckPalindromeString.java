package CheckWhetherAStringIsPalindromeOrNot;

import java.util.Scanner;

public class CheckPalindromeString {
    public static boolean checkPalindrome(String text){
        String reverse="";
        for(int i=text.length()-1;i>=0;i--){
            reverse=reverse+text.charAt(i);
        }
        if(text.equals(reverse)){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text: ");
        text = input.next();
        boolean res = checkPalindrome(text);
        System.out.println(res);

    }
}
