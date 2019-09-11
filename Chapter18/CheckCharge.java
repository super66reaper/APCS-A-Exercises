import java.util.Scanner;

public class CheckCharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double checkingAcc;
        double savingAcc;
        final double serviceCharge = 0.15;

        System.out.println("How much money do you have in checkings:");
        checkingAcc = scan.nextDouble();
        System.out.println("How much money do you have in savings:");
        savingAcc = scan.nextDouble();

        if (checkingAcc > 1000 || savingAcc > 1500) {
            System.out.println("There is no service charge");
        }
        else {
            System.out.println("you have a service charge of $" + serviceCharge + " per check");
        }
    }
}