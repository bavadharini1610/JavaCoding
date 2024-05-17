package SmallestElementInArray;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElementInArray {
    public static int findMin(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<smallest) {
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args){
        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element "+i+": ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println("Minimum number is: "+min);

    }
}

