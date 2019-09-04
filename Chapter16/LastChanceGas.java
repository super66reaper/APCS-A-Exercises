import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tankCap;
        int gageReader;
        int milePG;

        System.out.print("Tank capacity:    ");
        tankCap = scan.nextInt();
        System.out.print("Gage Reading:     ");
        gageReader = scan.nextInt();
        System.out.print("Miles Per Gallon: ");
        milePG = scan.nextInt();
        if (gageReader < 0 || gageReader > 100) {
            System.out.println("Gage can't be over 100 or less then 0");
            System.exit(0);
        }

        int gagePercent = 1000 / gageReader;
        int tankFilled = (tankCap * 10) / gagePercent;
        int milesCanGo = tankFilled * milePG;

        if (milesCanGo < 200) {
            System.out.println("Get Gas!");
        }
        else {
            System.out.println("Safe To Proceed");
        }
    }
}