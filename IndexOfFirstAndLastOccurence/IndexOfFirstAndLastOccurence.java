package IndexOfFirstAndLastOccurence;

import java.util.Scanner;

public class IndexOfFirstAndLastOccurence {

    public static void indexOfOccurence(int[] arr, int element){
        int firstOccurence=0;
        int lastOccurence=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                firstOccurence = i;
                break;
            }

        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]==element){
                lastOccurence=j;
                break;
            }
        }
        System.out.println("first Occurence: "+firstOccurence);
        System.out.println("last Occurence: "+lastOccurence);


    }
    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        length=input.nextInt();
        int[] arr= new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter the array element "+i+" :");
            arr[i]=input.nextInt();
        }
        int element;
        System.out.println("Enter the element whose occurence needs to be found: ");
        element=input.nextInt();
        indexOfOccurence(arr,element);
    }
}
