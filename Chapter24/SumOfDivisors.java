import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum = 0;
        
        System.out.println("What is n");
        n = scan.nextInt();

        int i;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the divisors is: " + sum);
    }
}