package CountNumberOfWordsInAStringUsingHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOfWordsInAString {
    public static HashMap<String,Integer> numberOfWords(String text){
        String words[] =text.split(" ");
        HashMap<String,Integer>wordCount = new HashMap<>();
        for(String word:words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            else{
                wordCount.put(word,1);
            }
        }

        return wordCount;
    }
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        text=input.nextLine();
        HashMap<String,Integer>count = numberOfWords(text);
        System.out.println(count);
    }
}
