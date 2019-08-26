public class Trigonometry {

    public static void main (String [] args) {
        double value = 0.5236;

        double sinX = Math.sin(value);
        double cosX = Math.cos(value);
        double sum = (sinX * sinX) + (cosX * cosX);

        sinX = sinX * 180/Math.PI;
        cosX = cosX * 180/Math.PI;
        sum = sum * 180/Math.PI;

        System.out.println("Sine: " + sinX + " Cosine: " + cosX + 
            " Sum of the Squares: " + sum);
    }
}