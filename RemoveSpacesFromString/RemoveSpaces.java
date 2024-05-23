package RemoveSpacesFromString;

import java.util.Scanner;

public class RemoveSpaces {

    public static String removeSpace(String text){
        String newString = text.replace(" ","");
        return newString;

    }
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        text=input.nextLine();
        String result = removeSpace(text);
        System.out.println(result);

    }
}
