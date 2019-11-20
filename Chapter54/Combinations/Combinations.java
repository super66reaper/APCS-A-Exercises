import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = 0;
        int R = 0;

        System.out.print("N: ");
        N = scan.nextInt();
        System.out.print("R: ");
        R = scan.nextInt();

        if(N > 20 || R > 20) {
            System.out.println("ERROR");
        }else {
            long answer = factorial(N) / (factorial(R) * factorial(N - R));
            System.out.println(answer);
        }
        
    }

    public static long factorial(int num) {
        long answer = 1;
        for(int i = 0; i < num; i++) {
            answer = answer * (i + 1);
        }
        return answer;
    }
}