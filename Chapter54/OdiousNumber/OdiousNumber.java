import java.util.*;

public class OdiousNumber {
    public static void main(String[] args) {
        int num = 0;
        OdiousNumberChecker numChecker = new OdiousNumberChecker(num);
        Scanner scan = new Scanner(System.in);
        askNum(num, numChecker, scan);
    }

    public static void askNum(int num, OdiousNumberChecker numChecker, Scanner scan) {
        while(num == Math.abs(num)) {
            System.out.println("Give me a non-negative number(enter a negative to end program)");
            num = scan.nextInt();

            numChecker.checkNum(num);
            if (num == Math.abs(num)) {
                System.out.println("\nThis number is " + numChecker.getNumType());
            }
        }
        System.exit(0);
    }
}