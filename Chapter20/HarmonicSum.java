import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int t = 0;
        double sum = 0;

        System.out.println("Enter N");
        n = scan.nextInt();

        while (t < n) {
            t += 1;
            sum += 1.0/t;
        }
        System.out.println(sum);
    }
}