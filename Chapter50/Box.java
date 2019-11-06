public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double width, double height, double length) {
        setWidth(width);
        setHeight(height);
        setLength(length);
    }

    public Box(Box oldBox, String change) {
        if(change.equals("bigger")) {
            width = oldBox.getWidth() * 1.25;
            height = oldBox.getHeight() * 1.25;
            length = oldBox.getLength() * 1.25;
        }else {
            width = oldBox.getWidth() * .75;
            height = oldBox.getHeight() * .75;
            length = oldBox.getLength() * .75;
        }
    }

    public boolean nests(Box outsideBox) {
        if(outsideBox.width > width && outsideBox.height > height && outsideBox.length > length) {
            return true; 
        }else {
            return false;
        }
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