import java.util.Scanner;

public class SumSeqInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int loopSum = 0;
        int formulaSum;

        System.out.println("Enter N:");
        n = scan.nextInt();

        int t = n;
        while (t > 0) {
            loopSum += t;
            t -= 1;
        }

        formulaSum = ((n * (n + 1)) / 2);

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);
    }
}