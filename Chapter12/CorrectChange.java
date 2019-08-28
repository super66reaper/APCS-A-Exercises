import java.util.Scanner;

public class CorrectChange {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int change;

        int dollar = 0;
        int quarter = 0;
        int dime = 0;
        int nickle = 0;
        int cent = 0;

        System.out.println("How much change is due?");
        change = scan.nextInt();

        dollar  = change / 100;
        quarter = (change % 100) / 25;
        dime    = ((change % 100) % 25) / 10;
        nickle  = (((change % 100) % 25) % 10) / 5;
        cent    = ((((change % 100) % 25) % 10) % 5);

        System.out.println("Your change is: " + dollar + " dollars, " + quarter
         + " quarters, " + dime + " dimes, " + nickle + " nickles, and " + cent + " cents");
    }
}