package DuplicateCharactersInString;

import java.util.*;

public class DuplicateCharacterInString {

    private static List<Character> findRepeatedChar(String text) {
        HashMap<Character,Integer>charCount = new HashMap<>();
        //programiz

        for(int i=0;i<text.length();i++){
            char c= text.charAt(i);
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            }
            else {
                charCount.put(c,1);
            }
        }
        List<Character> repeatedChars = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {

            if(entry.getValue() >1) {
                repeatedChars.add(entry.getKey());
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
        // return the repeated character
        return repeatedChars;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Enter the text: ");
        text=input.nextLine();
        List<Character> repeatedChar = findRepeatedChar(text);
        System.out.println("The repeated Char is: "+ repeatedChar);
    }


}
