import java.util.Scanner;

public class ApplianceCost {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double costKPerHour;
        double usedKPerYear;

        System.out.println("Enter cost per kilowatt-hour in cents");
        costKPerHour = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used oer year");
        usedKPerYear = scan.nextDouble();

        double annualCost = costKPerHour * usedKPerYear;
        System.out.println("Annual Cost: " + annualCost / 100);
    }
}