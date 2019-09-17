import java.util.Scanner;
import java.lang.Math;

public class EToX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int n = 0;
        int nNot = 0;
        double term = 1;
        double sum = 1;

        System.out.println("Enter X:");
        x = scan.nextInt();

        while (term > 1.0E-12) {
            n += 1;
            if (n == 1) {
                term = 2;
                nNot = 1;
            }
            else {
                nNot = nNot * n;
                term = (Math.pow(x, n)) / nNot;
            }
            sum += term;

            System.out.println("n:" + n + "    term: " + term + "       sum: " + sum);
        }
        System.out.println("my   e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));
    }
}