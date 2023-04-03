
//program to check whether a character is an alphabet, digit or special character.
import java.util.Scanner;

public class checkingCharacter {
    public static void main(String args[]) {
        // getting input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE MESSAGE: ");
        char message = scanner.next().charAt(0);
        // checking for characters
        if ((message >= 'a' && message <= 'z') || (message >= 'A' && message <= 'Z')) {
            System.out.println("THE GIVEN MESSAGE IS CHARACTER.");
        }
        // checking for numbers
        else if (message >= '0' && message <= '9') {
            System.out.println("THE GIVEN MESSAGE IS NUMBER.");
        } else {
            System.out.println("THE GIVEN MESSAGE CONTAINS A SPECIAL SYMBOLS.");
        }
        scanner.close();

    }
}
