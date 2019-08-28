import java.util.Scanner;

public class FurtherSubString {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        String subString;
        
        int index1;
        int index2;


        System.out.println("Enter a string:");
        str = scan.nextLine();
        
        System.out.println("Enter beginning index:");
        index1 = scan.nextInt();
        System.out.println("Enter ending index:");
        index2 = scan.nextInt();

        System.out.println("Original string: ");
        System.out.println(str);

        subString = str.substring(index1, index2);

        System.out.println("Substring: ");
        System.out.println(subString);
    }
}