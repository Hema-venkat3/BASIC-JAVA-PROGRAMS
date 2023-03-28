public class performOperations {
    //declaring a static method
    private static void displayOperations() {
        //declaring and initializing a variables
        int a = 20;
        int b = 15;
        //subtraction
        int sub = a - b;
        //multiplication
        int mul = a * b;
        //division
        int div = a / b;
        //printing the results with display message
        System.out.println("THE SUBTRACTION OF TWO NUMBERS IS: " + sub);
        System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS: " + mul);
        System.out.println("THE DIVISION OF TWO NUMBERS IS: " + div);
    }

    public static void main(String args[]) {
        //calling a static method
        displayOperations();
    }
}
