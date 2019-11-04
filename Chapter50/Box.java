public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double width, double height, double length) {
        setWidth(width);
        setHeight(height);
        setLength(length);
    }

    public Box(Box oldBox) {
        width = oldBox.getWidth();
        height = oldBox.getHeight();
        length = oldBox.getLength();
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

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return (2 * (height * width)) + (2 * (height * length)) + (2 * (width * length));
    }

    public double faceArea() {
        return length * height;
    }

    public double topArea() {
        return length * width;
    }

    public double sideArea() {
        return width * height;
    }
}