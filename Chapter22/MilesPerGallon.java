import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialMiles;
        int finalMiles;
        int gallons;
        int milesPerGallon;

        while(1 == 1) {
            System.out.println("Initial miles:");
            initialMiles = scan.nextInt();
            if (initialMiles < 0) {
                System.out.println("bye");
                System.exit(0);
            }
            System.out.println("Final miles:");
            finalMiles = scan.nextInt();
            System.out.println("Gallons used:");
            gallons = scan.nextInt();

            milesPerGallon = (finalMiles - initialMiles) / gallons;
            System.out.println(milesPerGallon + "\n");
        }
    }
}