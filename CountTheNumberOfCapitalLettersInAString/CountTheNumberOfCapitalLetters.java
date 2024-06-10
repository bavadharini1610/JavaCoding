package CountTheNumberOfCapitalLettersInAString;

import java.util.Scanner;

public class CountTheNumberOfCapitalLetters {
     public static int countOfCapitalLetters(String text){
         int count=0;
         char current;
         for(int i=0;i<text.length();i++){
             current = text.charAt(i);
             if(Character.isUpperCase(current)){
                 count++;
             }
         }
         return count;
     }

    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        text= input.nextLine();
        int count = countOfCapitalLetters(text);
        System.out.println(count);
    }
}
