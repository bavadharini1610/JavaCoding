package NumberOfVowelsInAString;

import java.util.Scanner;

public class NumberOfVowels {

    public static int vowels(String str){
        String lowStr=str.toLowerCase();
        int count =0;
        for(int i=0;i<lowStr.length();i++){
            if(lowStr.charAt(i)=='a'||lowStr.charAt(i)=='e'||lowStr.charAt(i)=='i'||lowStr.charAt(i)=='o'||lowStr.charAt(i)=='u'){
                count=count+1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        int vowels = vowels(str);
        System.out.println(vowels);

    }
}
