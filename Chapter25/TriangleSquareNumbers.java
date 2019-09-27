public class TriangleSquareNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        
        System.out.println("all square and triangle numbers up to 500:");

        for (int i = 0; i <= 50000; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                for (n = 0, sum = 0; sum <= i; n++) {
                    sum += n;
                    if (sum == i) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}