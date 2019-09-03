import java.util.Scanner;

public class OrderCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int usrBolts;
        int usrNuts;
        int usrWashers;

        boolean error = false;

        String error1;
        String error2;

        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;

        System.out.print("\nBolts purchased: ");
        usrBolts = scan.nextInt();
        System.out.print("Nuts purchased: ");
        usrNuts = scan.nextInt();
        System.out.print("Washers purchased: ");
        usrWashers = scan.nextInt();

        if (usrNuts >= usrBolts) {
            error1 = "";
        }
        else {
            error = true;
            error1 = " too few nuts";
        }
        if (usrWashers >= usrBolts * 2) { 
            error2 = "";
        }
        else {
            if (error) {
                error2 = " and too few washers";
            }
            else {
                error = true;
                error2 = " too few washers";
            }
        }


        if (!error) {
            System.out.println("\nOrder is OK");
        }
        else {
            System.out.print("\nCheck the Order:");
            System.out.print(error1);
            System.out.print(error2);
        }

        final int totalCost = (usrBolts * boltPrice) + (usrNuts * nutPrice) + (usrWashers * washerPrice);
        System.out.println("\nTotal cost: " + totalCost);
    }
}