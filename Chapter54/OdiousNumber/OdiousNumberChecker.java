public class OdiousNumberChecker {
    private int num ;
    private String numType;

    public OdiousNumberChecker(int num) {
        setNum(num);
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNumType() {
        return numType;
    }

    public void checkNum(int num) {
        setNum(num);
        numType = "odious";
    }
}