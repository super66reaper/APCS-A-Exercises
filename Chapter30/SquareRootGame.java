import java.util.*;
import java.lang.Math;

public class SquareRootGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int rounds;
        String firstPlayerName;
        String secondPlayerName;

        System.out.print("How many rounds? ");
        //Had to do scan.nextline() because it messes up with next line after the next int
        rounds = scan.nextInt();
        scan.nextLine();

        System.out.print("First Player, sign in--> ");
        firstPlayerName = scan.nextLine();

        System.out.print("Second Player, sign in--> ");
        secondPlayerName = scan.nextLine();

        int i;
        double squareRootNum = 0;
        double firstPlayerGuess = 0;
        double secondPlayerGuess = 0;
        double correctSquareRoot = 0;
        double firstPlayerDif = 0;
        double secondPlayerDif = 0;
        int firstPlayerWins = 0;
        int secondPlayerWins = 0;
        boolean turnSwitch = true;
        for (i = 0; i < rounds; i++) {
            squareRootNum = rand.nextDouble() * 100;
            System.out.println("\nWhat is the square root of " + squareRootNum);
            if (turnSwitch) {
                System.out.print(firstPlayerName + ", what is your guess: ");
                firstPlayerGuess = scan.nextDouble();
                System.out.print(secondPlayerName + ", what is your guess: ");
                secondPlayerGuess = scan.nextDouble();
                turnSwitch = false;
            }else {
                System.out.print(secondPlayerName + ", what is your guess: ");
                secondPlayerGuess = scan.nextDouble();
                System.out.print(firstPlayerName + ", what is your guess: ");
                firstPlayerGuess = scan.nextDouble();
                turnSwitch = true;
            }

            correctSquareRoot = Math.sqrt(squareRootNum);
            System.out.println("The correct square root is: " + correctSquareRoot);

            firstPlayerDif = Math.abs(correctSquareRoot - firstPlayerGuess);
            secondPlayerDif = Math.abs(correctSquareRoot - secondPlayerGuess);
            System.out.println(firstPlayerName + " is " + firstPlayerDif + " away");
            System.out.println(secondPlayerName + " is " + secondPlayerDif + " away");
            if (firstPlayerDif == secondPlayerDif) {
                System.out.println("Its a tie");
            } else if(firstPlayerDif > secondPlayerDif) {
                System.out.println(secondPlayerName + " Wins!");
                secondPlayerWins ++;
            }else if(secondPlayerDif > firstPlayerDif) {
                System.out.println(firstPlayerName + " Wins!");
                firstPlayerWins ++;
            }
        }

        System.out.println("\n---- Final Score ----");
        System.out.println(firstPlayerName + ": " + firstPlayerWins + "   " + secondPlayerName + ": " + secondPlayerWins);
    }
}