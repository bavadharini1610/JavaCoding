package FindLeadersInAnArray;

import java.util.Arrays;
import java.util.Scanner;

public class LeadersInAnArray {

    public static int[] leadersInArray(int[] arr){
        //[3,1,8,2,5,4]
        //result[8,5,4]
        int[] leaders = new int[arr.length];
        int index=0;

        int max =arr[arr.length-1];
        leaders[index]=max;
        index++;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                leaders[index]=max;
                index++;
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = leaders[i];
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+i+" array element: ");
            arr[i]=input.nextInt();
        }
        int[] leaders = leadersInArray(arr);
        System.out.println(Arrays.toString(leaders));
    }
}
