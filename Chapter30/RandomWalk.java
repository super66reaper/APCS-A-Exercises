import java.util.*;

public class RandomWalk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        double x = 0;
        double y = 0;
        double xAdd;
        double yAdd;
        double distance;
        System.out.println("How many steps will the ant take?");
        int stepTaken = scan.nextInt();


        for (int t = 0; t <= stepTaken; t++) {
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