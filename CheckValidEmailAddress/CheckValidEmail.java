package CheckValidEmailAddress;

import java.util.Scanner;

public class CheckValidEmail {

    public static boolean isValidEmail(String email) {

        // check if the email matches the regular expression
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the email address to check");
        String email = input.nextLine();
        if(isValidEmail(email)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
