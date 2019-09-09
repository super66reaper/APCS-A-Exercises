import java.util.Scanner;

public class InternetDelicatessen {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String usrItem;
        int usrPrice;
        int usrDeliveryOption;

        int deliveryPrice;
        int totalPrice;

        System.out.print("Enter the item: ");
        usrItem = scan.nextLine();
        System.out.print("Enter the price(cents): ");
        usrPrice = scan.nextInt();
        System.out.print("Overnight delivery (0==no, 1==yes): ");
        usrDeliveryOption = scan.nextInt();

        if (usrPrice < 1000) {
            if (usrDeliveryOption == 0) {
                deliveryPrice = 200;
            }
            else {
                deliveryPrice = 500;
            }
        }
        else {
            if (usrDeliveryOption == 0) {
                deliveryPrice = 0;
            }
            else {
                deliveryPrice = 300;
            }
        }

        totalPrice = deliveryPrice + usrPrice;
        
        System.out.println("Invoice:");
        System.out.println(usrItem + " " + usrPrice);
        System.out.println("delivery " + deliveryPrice);
        System.out.println("total " + totalPrice);
    }
}