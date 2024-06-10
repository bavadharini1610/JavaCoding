package SeperateOddAndEvenInAnArray;

import java.util.ArrayList;
import java.util.Scanner;

public class SeperateOddAndEvenInAnArray {

    public static void seperateOddAndEvenInArray(int[] arr){
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int num:arr){
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        System.out.println("Odd Numbers: "+odd);
        System.out.println("Even Numbers: "+even);
    }




    public static void main(String[] args) {

        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<6;i++){
            System.out.println("Enter the array element "+i+" :");
            arr[i]=input.nextInt();
        }
        seperateOddAndEvenInArray(arr);


    }
}
