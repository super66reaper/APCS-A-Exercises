import java.util.*;

public class Communicator {
    Scanner scan = new Scanner(System.in);

    private Jam jam1;
    private Jam jam2;
    private Jam jam3;

    public Communicator(Jam jam1, Jam jam2, Jam jam3) {
        this.jam1 = jam1;
        this.jam2 = jam2;
        this.jam3 = jam3;
    }

    public void listJams() {
        int jamNum = 1;
        printJamInfo(jam1, jamNum);
        jamNum += 1;
        printJamInfo(jam2, jamNum);
        jamNum += 1;
        printJamInfo(jam3, jamNum);
    }
    
    private void printJamInfo(Jam jam, int jamNum) {
        System.out.println(jamNum + ": " + jam.getContents() + "   " + jam.getDate() + "   " + jam.getCapacity() + " fl. oz.");
    }
}