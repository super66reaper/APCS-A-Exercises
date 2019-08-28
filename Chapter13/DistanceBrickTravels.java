import java.util.Scanner;

public class DistanceBrickTravels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double time;
        double distance;
        double g = 32.174;

        System.out.println("Enter the number of seconds:");
        time = scan.nextDouble();

        distance = (1/2.0) * (g * (time * time));

        System.out.println("Distance: " + distance);
    }
}