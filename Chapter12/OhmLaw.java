import java.util.Scanner;

public class OhmLaw {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int volts;
        int resistance;
        double current;

        System.out.println("What is the voltage measured in volts in the device?");
        volts = scan.nextInt();
        System.out.println("What is the resistance measured in ohms in the device?");
        resistance = scan.nextInt();

        current = (volts + 0.0) / resistance;

        System.out.println("The current amps flowing through the device is: " + current);
    }
}