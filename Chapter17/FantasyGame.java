import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usrCharName;
        int usrStrength;
        int usrHealth;
        int usrLuck;
        final int maxPoints = 15;

        System.out.println("Welcome to Fortnite");
        System.out.println("Enter the name of your character:");
        usrCharName = scan.nextLine();
        System.out.println("Enter strength (1-10):");
        usrStrength = scan.nextInt();
        System.out.println("Enter health (1-10):");
        usrHealth = scan.nextInt();
        System.out.println("Enter luck (1-10):");
        usrLuck = scan.nextInt();

        int totalPoints = usrStrength + usrHealth + usrLuck;

        if (totalPoints < maxPoints) {
            System.out.println("\nYour character: " + usrCharName + " has been created with stats:");
            System.out.println("Stength: " + usrStrength);
            System.out.println("Health:  " + usrHealth);
            System.out.println("Luck:    " + usrLuck);
        }
        else {
            System.out.println("\nYou have given your character too many points! Default values have been assigned:");
            System.out.println(usrCharName + ", strength: 5, health: 5, luck: 5");
            usrStrength = 5;
            usrHealth = 5;
            usrLuck = 5;
        }
    }
}