package MinimumCharacterToMakeAStringPalindrome;

import java.util.Scanner;

public class MinimumCharToMakePalindrome {
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
        text=input.next();
        int count=0;
        //System.out.println(minChar);
        while(text.length()>0) {


            if (checkPalindrome(text) == true) {
                break;
            } else {
                text = text.substring(0, text.length() - 1);
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
