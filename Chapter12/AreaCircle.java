import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int usrdata;
        double area;

        System.out.println("Input the radius");

        usrdata = scan.nextInt();

        area = (usrdata * usrdata) * Math.PI;

        System.out.println("The radius is: " + usrdata + " The area is: " + area);
        
    }
}