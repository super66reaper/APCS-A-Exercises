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
        numType = getBinaryOfNum(this.num);
    }

    public String getBinaryOfNum(int num) {
        String binaryOfNum = "";
        int numToCheck;
        for(numToCheck = num; numToCheck != 0; numToCheck = numToCheck / 2) {
            int numToAdd = (numToCheck % 2);
            binaryOfNum = Integer.toString(numToAdd) + binaryOfNum;
        }

        int numOfIs = 0;
        for (int i = 0; i < binaryOfNum.length(); i++) {
            if(binaryOfNum.charAt(i) == '1') {
                numOfIs++;
            }
        }
        if (numOfIs % 2 == 0) {
            return "false";
        }else {
            return "true";
        }
    }
}