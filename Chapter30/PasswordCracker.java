import java.util.*;

public class PasswordCracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a secret password 5 letters or less");
        String usrPass = scan.nextLine();

        String guess = "";

        String chara = "abcdefghijklmnopqrstuvwxyz ";

        int t = 0;
        for (int attempts = 0; !guess.equals(usrPass); attempts++) {
            guess = "";
            for(t = 0; t <= 5; t++) {

                guess += chara.charAt(random.nextInt(chara.length()));
            }
        }
        System.out.println(guess);
    }
}