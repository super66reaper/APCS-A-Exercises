import java.util.Scanner;

public class RunOfIntegers {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int startVal;
        int endVal;

        System.out.println("Enter Start:");
        startVal = scan.nextInt();
        System.out.println("Enter End:");
        endVal = scan.nextInt();

        int timesToRun = (endVal - startVal) + 1;
        int numberToPrint = startVal;

        System.out.println("\n");

        while(timesToRun > 0) {
            System.out.println(numberToPrint);
            numberToPrint += 1;
            timesToRun -= 1;
        }
    }
}