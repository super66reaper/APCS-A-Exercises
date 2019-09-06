import java.util.Scanner;
import java.lang.Math;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int windSpeed;
        int temp;

        double windChill;

        System.out.print("Wind Speed: ");
        windSpeed = scan.nextInt();
        System.out.print("Temperature: ");
        temp = scan.nextInt();

        if ((windSpeed < 3) || (temp > 50)) {
            windChill = temp;
        }
        else {
            double v = Math.pow(windSpeed, 0.16);
            windChill = 35.74 + 0.6215 * temp - 35.75 * v + 0.4275 * temp * v;
        }
        System.out.println("Wind Chill: " + windChill);
    }
}