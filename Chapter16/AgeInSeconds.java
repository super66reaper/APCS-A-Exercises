import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int usrYears;
        int usrMonths;
        int usrDays;

        double averageLiveSpan = 2500000000.0;

        System.out.println("How long have you been alive?");
        System.out.print("Years: ");
        usrYears = scan.nextInt();
        System.out.print("Months: ");
        usrMonths = scan.nextInt();
        System.out.print("Days: ");
        usrDays = scan.nextInt();

        int monthsToDays;

        if (usrMonths % 2 == 0) {
            //0,2,4,6,8,10,12

            if (usrMonths >= 4) {
                //4,6,8,10,12

                monthsToDays = 120 + (((usrMonths - 4) / 2) * 61);
                if (usrMonths >= 8) {
                    //8,10,12

                    monthsToDays += 1;
                }
            }
            else {
                //0,2

                if (usrMonths == 2) {
                    //2

                    monthsToDays = 59;
                }
                else {
                    //0

                    monthsToDays = 0;
                }
            }
        }
        else {
            //1,3,5,7,9,11

            if (usrMonths >= 3) {
                monthsToDays = 90 + (((usrMonths - 3) / 2) * 61);
            }
            else {
                monthsToDays = 31;
            }
        }


        int yearsToDays = usrYears * 365;
        int daysAlive = yearsToDays + monthsToDays + usrDays;
        int daysToSeconds = (((daysAlive * 24) * 60) * 60);

        System.out.println("You have been alive for " + daysToSeconds + " seconds!");

        double percentageLived = daysToSeconds / averageLiveSpan;
        System.out.println("you have lived about " + percentageLived * 100 + "% of your life!");
    }
}