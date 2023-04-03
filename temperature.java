import java.util.Scanner;

//program to read temperature in centigrade and display a suitable message
public class temperature {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE IN CENTIGRADE: ");
        float temperature = scanner.nextFloat();
        if (temperature < 0) {
            System.out.println("Freezing wheather");
        } else if (temperature < 10) {
            System.out.println("Very cold wheather");
        } else if (temperature < 20) {
            System.out.println("Cold wheather");
        } else if (temperature < 30) {
            System.out.println("Normal temperature");
        } else if (temperature < 40) {
            System.out.println("It's a hot wheather");
        } else {
            System.out.println("Very hot wheather");
        }
        scanner.close();
    }
}
