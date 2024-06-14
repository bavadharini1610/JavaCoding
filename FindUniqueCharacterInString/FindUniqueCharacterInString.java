package FindUniqueCharacterInString;

import java.util.ArrayList;
import java.util.Scanner;

public class FindUniqueCharacterInString {
    public static ArrayList<Character> findUniqueCharacter(String text){
        ArrayList<Character> unique = new ArrayList<>();
        for(int i=0;i<text.length();i++){
            char currentChar=text.charAt(i);
            boolean isUnique=true;

            for(int j=0;j<text.length();j++){
                if(i!=j && currentChar ==text.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique && !unique.contains(currentChar)){
                unique.add(currentChar);
            }
        }

        return unique;
    }
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text: ");
        text=input.next();
        ArrayList<Character> unique = findUniqueCharacter(text);
        System.out.println(unique);

    }
}
