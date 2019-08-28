import java.util.Scanner;

public class CentsToDollars {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int usrCents;
        int cents = 0;
        int dollars = 0;

        System.out.println("Input the cents:");
        usrCents = scan.nextInt();

        cents = usrCents % 100;
        dollars = usrCents / 100;

        System.out.println("That is " + dollars + " dollars and " + cents + " cents!");
    }
}