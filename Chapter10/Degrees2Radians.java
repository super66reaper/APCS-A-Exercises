public class Degrees2Radians {

    public static void main (String [] args) {
        double value = 200.0;

        double sinX = Math.sin(value);
        double cosX = Math.cos(value);
        double sum = (sinX * sinX) + (cosX * cosX);

        sinX = sinX * Math.PI / -180;

        System.out.println("Sine: " + sinX + " Cosine: " + cosX + 
            " Sum of the Squares: " + sum);
    }
}