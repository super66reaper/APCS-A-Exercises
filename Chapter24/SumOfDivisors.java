import java.util.Scanner;

public class SumOfDivisors {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int nSum = 0;
        int nSquared;

        System.out.println("What is n:");
        n = scan.nextInt();

        nSquared = n * n;

        int i;
        for(i = 1; i <= n; i++) {
            nSum += i;
        }

        System.out.println("N^2 is: " + nSquared);
        System.out.println("The sum of all numbers from 1 to N is: " + nSum);
    }
}