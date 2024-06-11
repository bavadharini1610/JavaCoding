package XPowerNUsingRecursion;

import java.util.Scanner;

public class XPowerNUsingRecursion {
    public static int xPowern(int x, int n){
        if(n==0){
            return 1;
        }
        return x*xPowern(x,n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int x= input.nextInt();
        System.out.println("Enter the power: ");
        int n = input.nextInt();
        int result = xPowern(x,n);
        System.out.println(result);

    }
}
