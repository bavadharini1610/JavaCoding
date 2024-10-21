package SpecialCharactersPalindromeString;

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean checkPalindrome(String text){
        String cleanText = text.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(cleanText);
        cleanText= cleanText.toLowerCase();
        System.out.println(cleanText);
        String reverse="";
        for(int i=cleanText.length()-1;i>=0;i--){
            reverse = reverse + cleanText.charAt(i);
        }
        if(cleanText.equals(reverse)){
            return true;
        }
        else{
            return false;

        }

    }
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        text = input.nextLine();
        boolean result = checkPalindrome(text);
        System.out.println(result);
    }
}
