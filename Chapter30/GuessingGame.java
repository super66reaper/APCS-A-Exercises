import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int guess;
        int randomNum = random.nextInt(10) + 1;
        
        System.out.println("I am thinking of a number from 1 to 10");
        System.out.println("You must guess it in 3 tries");

        for (int guesses = 0; guesses < 3; guesses++) {
            System.out.println("Enter a guess:");
            guess = scan.nextInt();
            if (guess == randomNum) {
                System.out.println("Right");
                System.out.println("you have won the game");
                System.exit(0);
            } else {
                System.out.println("wrong");
            }
        }
        System.out.println("the correct number was " + randomNum);
    }
}