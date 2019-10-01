import java.util.*;

public class RandomWalk {
    public static void main(String[] args) {
        Random random = new Random();
        double x = 0;
        double y = 0;
        double xAdd;
        double yAdd;
        double distance;

        for (int t = 0; t <= 1000; t++) {
            xAdd = random.nextDouble() * 2 - 1;
            yAdd = random.nextDouble() * 2 - 1;
            x += xAdd;
            y += yAdd;
        }
        distance = Math.sqrt((x * x) + (y + y));
        System.out.println("The ant walked to " + x + " " + y);
        System.out.println("The ant traveled " + distance + " from the origin");
    }
}