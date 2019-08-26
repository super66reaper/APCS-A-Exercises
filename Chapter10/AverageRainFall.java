public class AverageRainFall {

    public static void main (String [] args) {
        double april = 12;
        double may = 14;
        double june = 8;

        double averageRainFall = (april + may + june) / 3.0;

        System.out.println("Rainfall for April: \t" + april);
        System.out.println("Rainfall for May: \t" + may);
        System.out.println("Rainfall for June: \t" + june);
        System.out.println("Average rainfall: \t" + averageRainFall);
    }

}