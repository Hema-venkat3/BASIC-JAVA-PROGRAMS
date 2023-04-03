import java.util.Scanner;

public class multiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive number to display the tables: ");
        int tableNo = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(tableNo + " * " + i + " = " + tableNo * i);
        }
        scanner.close();
    }
}
