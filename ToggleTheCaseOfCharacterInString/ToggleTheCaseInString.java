package ToggleTheCaseOfCharacterInString;

import java.util.Scanner;

public class ToggleTheCaseInString {

    public static String toggleTheCase(String text){
        String toggledString="";
        for(int i=0;i<text.length();i++){
            char current = text.charAt(i);
            if(Character.isUpperCase(current)){
                toggledString+=Character.toLowerCase(current);
            }
            else{
                toggledString+=Character.toUpperCase(current);
            }
        }
        return toggledString;

    }
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Text: ");
        text = input.nextLine();
        String toggledString = toggleTheCase(text);
        System.out.println("The toggled String is: "+toggledString);

    }
}
