import java.lang.Math;

public class SheepHerdSize {
    public static void main(String[] args) {
        double n = 20;
        int t = 0;
        int yearOfIndependence = 0;

        for (t = 0; t <= 25; t++) {
            n = 220.0 / (1.0 + (10.0 * (Math.pow(0.83, t))));
            System.out.println("On year " + t + " the number of sheep will be " + n);
            if (n >= 80 && yearOfIndependence == 0) {
                yearOfIndependence = t;
            }
        }
        System.out.println("On year " + yearOfIndependence + " the sheep population will be able to maintain itself");
    }
}