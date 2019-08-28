import java.util.Scanner;

public class LogBaseTwo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        double answer;

        System.out.println("Enter a double:");
        x = scan.nextDouble();

        answer = Math.log(x) / Math.log(2);

        System.out.println("Base 2 log of " + x + " is " + answer);
    }
}