import java.util.Scanner;

public class TownDump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int trashPounds;

        double trashCharge;

        System.out.println("How many pounds of trash will you be depositing:");
        trashPounds = scan.nextInt();

        if (trashPounds < 200) {
            trashCharge = trashPounds / 10;
        }
        else {
            trashCharge = 20 + ((trashPounds - 200) / 12.5);
        }

        System.out.println("You Owe: $" + trashCharge);

    }
}