public class sumOfNaturalNumbers {
    public static void main(String args[]) {
        int i, num = 10, sum = 0;
        for (i = 1; i <= num; ++i) {
            sum = sum + i;
        }
        System.out.println("SUM OF FIRST 10 NATURAL NUMBERS IS: " + sum);
    }
}