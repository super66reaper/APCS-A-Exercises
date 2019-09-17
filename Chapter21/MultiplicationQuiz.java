import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random(10);
        int var1;
        int var2;
        int usrCorrect = 0;
        int usrAnswer;
        int answer;
        int t = 10;

        while (t > 0) {
            t -= 1;
            var1 = ran.nextInt(10);
            var2 = ran.nextInt(10);
            answer = var1 * var2;
            System.out.print("What is " + var1 + " * " + var2 + "?");
            usrAnswer = scan.nextInt();

            if (usrAnswer == answer) {
                System.out.println("Right!");
                usrCorrect += 1;
            }
            else{
                System.out.println("wrong. " + var1 + " * " + var2 + " is " + answer);
            }
        }
        System.out.println("You got " + usrCorrect + " out of 10 questions correct!");
    }
}