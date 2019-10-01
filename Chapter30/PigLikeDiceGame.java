import java.util.*;

public class PigLikeDiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int playerPoints = 0;
        int computerPoints = 0;
        
        int i = 0;
        int compRole;
        int playerRole;
        boolean doesPlayerRole = true;
        int sum = 0;
        int doesPlayerRoleInt = 1;

        System.out.println("Welcome to pig game");
        while (playerPoints < 100 && computerPoints < 100) {
            System.out.println("\nComputers Turn");
            sum = 0;
            for (i = 0; i < 3; i++) {
                compRole = rand.nextInt(6) + 1;
                sum += compRole;
                System.out.println("Computer role a " + compRole);
            }
            computerPoints += sum;
            sum = 0;
            System.out.println("\nPlayers Turn");
            playerRole = 0;
            doesPlayerRole = true;
            while (doesPlayerRole) {
                playerRole = rand.nextInt(6) + 1;
                if (playerRole != 1) {
                    System.out.println("\nYou rolled a " + playerRole);
                    sum += playerRole;
                    System.out.println("Would you like to roll again?(1 for true, anything else for false)");

                    doesPlayerRoleInt = scan.nextInt();
                    if (doesPlayerRoleInt == 1) {
                        doesPlayerRole = true;
                    } else {
                        doesPlayerRole = false;
                    }
                } else {
                    sum = 0;
                    doesPlayerRole = false;
                    System.out.println("You got a 1 and lost all your points");
                }
            }
            playerPoints += sum;
            System.out.println("\n\n\n\n\n");
            System.out.println("\nPlayer has " + playerPoints + " points");
            System.out.println("Computer has " + computerPoints + " points");
        }

        if (playerPoints > computerPoints) {
            System.out.println("\nThe Winner Is...");
            System.out.println("YOU!!!");
        } else {
            System.out.println("\nThe Winner Is...");
            System.out.println("The computer, better luck next time");
        }
    }
}