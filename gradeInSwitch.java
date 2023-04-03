
//program in to accept a grade and declare the equivalent description  
import java.util.Scanner;

public class gradeInSwitch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // getting input from the user
        System.out.println("ENTER THE VARIABLE: ");
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'E':
                System.out.println("EXCELLENT");
                break;
            case 'V':
                System.out.println("VERY GOOD");
                break;
            case 'G':
                System.out.println("GOOD");
                break;
            case 'A':
                System.out.println("AVERAGE");
                break;
            case 'F':
                System.out.println("FAIL");
                break;
            default:
                System.out.println("UNDEFINED");
        }
        scanner.close();
    }
}
