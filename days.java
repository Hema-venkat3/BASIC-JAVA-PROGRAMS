import java.util.Scanner;

//program to read any day number in integer and display day name in the word.
public class days {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO DISPALY A DAY: ");
        int days = scanner.nextInt();
        switch (days) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("UNKNOWN");
        }
        scanner.close();
    }
}
