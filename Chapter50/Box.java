public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width) {
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }
}