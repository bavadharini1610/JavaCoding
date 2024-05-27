package Seperate0and1InArray;

import java.util.Arrays;
import java.util.Scanner;

public class Seperate0and1InArray {
    public static int[] seperate0and1(int[] arr){
        int count=0;
        int[] output = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int ones = arr.length-count;
        for(int i=0;i<count;i++){
            output[i]=0;
        }
        for(int i=count;i<output.length;i++){
            output[i]=1;
        }
        return output;

    }
    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        length = input.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter the array element "+i+", the array element should be only 0's or 1's :");
            arr[i]=input.nextInt();
            if(arr[i]!=0 && arr[i] !=1){
                System.out.println("Please enter 0's or 1's as array elements");
                arr[i] =input.nextInt();
            }
        }

        int[] output = seperate0and1(arr);
        System.out.println("The sorted array is"+ Arrays.toString(output));


    }
}
