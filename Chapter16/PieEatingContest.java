import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int usrWeight;

        System.out.print("You're Weight: ");
        usrWeight = scan.nextInt();

        if ((usrWeight >= 250 && usrWeight <= 280) || (usrWeight <= 250 && usrWeight >= 220)) {
            System.out.println("You are allowed in the contest");
        }
        else {
            System.out.println("You are NOT allowed in the contest");
        }
    }
}