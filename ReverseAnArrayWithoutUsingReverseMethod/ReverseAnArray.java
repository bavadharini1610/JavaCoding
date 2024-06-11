package ReverseAnArrayWithoutUsingReverseMethod;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static int[] reverseArray(int[] arr){
        int[] reverse = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            reverse[j]=arr[i];
            j++;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();
        arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter the array element "+i+" :");
            arr[i]=input.nextInt();
        }
        int[] reverse = reverseArray(arr);
        System.out.println(Arrays.toString(reverse));
    }
}
