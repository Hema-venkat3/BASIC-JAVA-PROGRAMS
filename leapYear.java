
//PROGRAM TO FIND WHEATHER A GIVEN YEAR IS LEAP YEAR OR NOT.
import java.util.Scanner;

public class leapYear {
    public static void main(String args[]) {
        // getting input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE YEAR: ");
        int year = scanner.nextInt();
        // if given year divisible by 4 it is leap year.
        if (year % 4 == 0) {
            System.out.println("THE GIVEN YEAR " + year + " IS A LEAP YEAR");
        } else {
            System.out.println("THE GIVEN YEAR " + year + " IS NOT A LEAP YEAR");
        }
        scanner.close();
    }
}
