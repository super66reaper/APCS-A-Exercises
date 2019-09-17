import java.util.Scanner;

public class AddingInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbersAdded;
        int usrInt;
        int sum = 0;

        System.out.println("How many integers will be added:");
        numbersAdded = scan.nextInt();

        while (numbersAdded > 0) {
            numbersAdded -= 1;
            System.out.println("Enter an integer:");
            usrInt = scan.nextInt();
            sum += usrInt;
        }
        System.out.println("\nThe sum is " + sum);
    }
}