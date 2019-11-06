public class Jam {
    private String contents;
    private String date;
    private int capacity;

    public Jam(String contents, String date, int capacity) {
        this.contents = contents;
        this.date = date;
        this.capacity = capacity;
    }

    public String getContents() {
        return this.contents;
    }

    public String getDate() {
        return date;
    }

    public int getCapacity() {
        return capacity;
    }
}