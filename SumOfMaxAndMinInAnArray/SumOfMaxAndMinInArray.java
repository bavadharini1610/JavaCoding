package SumOfMaxAndMinInAnArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfMaxAndMinInArray {

    public static int sumOfMaxAndMin(int[] arr, int length){
//        Arrays.sort(arr);
//        int smallest=arr[0];
//        int largest = arr[length-1];
//        return smallest+largest;
        int smallest = Integer.MAX_VALUE;
        System.out.println("initial smallest: "+smallest);
        int largest = Integer.MIN_VALUE;
        System.out.println("initial largest: " + largest);
        for(int i=0;i<length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return largest+smallest;
    }
    public static void main(String[] args) {
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = input.nextInt();
        arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter the array element "+i+" :");
            arr[i]=input.nextInt();
        }
        int sum = sumOfMaxAndMin(arr,length);
        System.out.println(sum);
    }
}
