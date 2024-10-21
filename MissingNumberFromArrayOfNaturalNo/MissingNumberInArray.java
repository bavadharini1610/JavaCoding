package MissingNumberFromArrayOfNaturalNo;

import java.util.Scanner;

public class MissingNumberInArray {

    public static int findMissingNumber(int[] numbers) {
        // initialize a variable to store the sum of the current array
        int sumOfCurrentArray = 0;
        // loop through the array and add each element to the sumOfCurrentArray variable
        for(int i=0;i<numbers.length;i++) {
            sumOfCurrentArray +=numbers[i];
        }

        // calculate the sum of natural numbers from 1 to n
        int n = numbers.length + 1;
        int sumOfSequence =(n*(n+1))/2;

        // calculate the missing number by subtracting the sum of the current array from the sum of the sequence
        int missingNumber = sumOfSequence-sumOfCurrentArray;

        // return the missing number
        return missingNumber;
    }
    public static void main(String[] args) {
        int lengthOfArr;
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the length of missing array: ");
        lengthOfArr = input.nextInt();
        int[] numbers = new int[lengthOfArr];

        // take input from the user
        for (int i = 0; i < lengthOfArr; i++) {
            System.out.println("Enter the " + i + "th number: ");
            numbers[i] = input.nextInt();
        }

        // call the findMissingNumber method and print the result
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }

}
