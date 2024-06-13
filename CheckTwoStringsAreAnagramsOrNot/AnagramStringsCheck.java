package CheckTwoStringsAreAnagramsOrNot;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringsCheck {
    public static boolean anagramCheck(String text1,String text2){
        char[] chArr1 = text1.toCharArray();
        char[] chArr2 = text2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        boolean result = Arrays.equals(chArr1,chArr2);
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String text1 = input.next();
        System.out.println("Enter the second String: ");
        String text2 = input.next();
        boolean result = anagramCheck(text1,text2);
        if(result==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }

    }
}
