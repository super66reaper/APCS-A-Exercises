import java.util.Scanner;

public class BirthdayParadox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPeople;
        final double daysInYear = 365;
        double probability = 1;

        System.out.println("How many people are there at the party:");
        numPeople = scan.nextInt();

        for(int i = 2; i <= numPeople; i++) {
            if (i == 2) {
                probability = (daysInYear - (i - 1)) / daysInYear;
            }else {
                probability = probability * ((daysInYear - (i - 1)) / daysInYear);
            }
        }
        System.out.println("The probability that nobody will have the same birthday is " + probability);

        int x = 0;
        probability = 0;
        for(x = 2; probability >= 0.5; x++) {
            if (x == 2) {
                probability = (daysInYear - (x - 1)) / daysInYear;
            }else {
                probability = probability * ((daysInYear - (x - 1)) / daysInYear);
            }
        }
        System.out.println(x);
    }
}