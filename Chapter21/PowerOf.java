import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double x;
        double sum = 1;

        System.out.println("Enter X");
        x = scan.nextDouble();
        System.out.println("Enter N");
        n = scan.nextInt();

        if (n < 0) {
            System.out.println("N must be a positive integer.");
        } 
        else {
            while (n > 0) {
                n -= 1;
                sum = sum * x;
            }
            System.out.println(x + " raised to the power of " + n + " is: " + sum);
        }
    }
}