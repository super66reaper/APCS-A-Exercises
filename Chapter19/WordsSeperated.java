import java.util.Scanner;

public class WordsSeperated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstWord;
        String secondWord;

        System.out.println("Enter first word:");
        firstWord = scan.nextLine();
        System.out.println("Enter second word:");
        secondWord = scan.nextLine();

        int firstLength;
        int secondLength;

        firstLength = firstWord.length();
        secondLength = secondWord.length();

        int t = 30 - (secondLength + firstLength);
        System.out.print(firstWord);
        while (t > 0) {
            System.out.print(".");
            t -= 1;
        }
        System.out.print(secondWord);
    }
}