import java.util.Scanner;

// program to read roll no, name and marks of three subjects and calculate the total, percentage and division 
public class studentDetails {
    public static void main(String args[]) {
        // getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ENTER THE ROLLNO : ");
        int rollNo = scanner.nextInt();
        System.out.println(" ENTER THE NAME : ");
        String name = scanner.next();
        System.out.println(" ENTER PHYSICS MARK : ");
        int physics = scanner.nextInt();
        System.out.println(" ENTER CHEMISTRY MARK : ");
        int chemistry = scanner.nextInt();
        System.out.println(" ENTER MATHS MARK : ");
        int maths = scanner.nextInt();
        // calculating the total marks
        int total = physics + chemistry + maths;
        System.out.println("THE TOTAL IS: " + total);
        // calculating the overall percentage
        int percentage = total / 3;
        System.out.println("THE OVERALL PERCENTAGE IS: " + percentage);
        // grading with if loop
        if (percentage >= 90) {
            System.out.println("Division = DISTINCTION");
        } else if (percentage >= 80) {
            System.out.println("Division = FIRST CLASS");
        } else if (percentage >= 60) {
            System.out.println("Division = pass");
        } else {
            System.out.println("Division = FAIL");
        }
        scanner.close();
    }

}
