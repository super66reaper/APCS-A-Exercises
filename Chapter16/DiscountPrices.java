import java.util.Scanner;

public class DiscountPrices {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int priceUsr;
        
        System.out.println("How much was the purchase in cents");
        priceUsr = scan.nextInt();

        if (priceUsr >= 1000) {
            int priceDis;
            priceDis = priceUsr - (priceUsr / 10);
            System.out.println(priceDis);
        }
        else {
            System.out.println("There is no discount");
        }

    }
}