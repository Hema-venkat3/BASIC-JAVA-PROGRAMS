import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int factNum = scanner.nextInt();
        int num, fact = 1;
        for (num = 1; num <= factNum; num++) {
            fact = fact * num;
        }
        scanner.close();
        System.out.println("The Factorial Of Given Number Is: " + fact);
    }
}

/*
 * int i,fact=1;
 * int number=5;//It is the number to calculate factorial
 * for(i=1;i<=number;i++){
 * fact=fact*i;
 * }
 * System.out.println("Factorial of "+number+" is: "+fact);
 * }
 * }
 */