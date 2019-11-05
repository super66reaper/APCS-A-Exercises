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
            width = biggerBox(oldBox).width;
            height = biggerBox(oldBox).height;
            length = biggerBox(oldBox).length;
        }else {
            width = smallerBox(oldBox).width;
            height = smallerBox(oldBox).height;
            length = smallerBox(oldBox).length;
        }
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(.75 * oldBox.getWidth(), .75 * oldBox.getHeight(), .75 * oldBox.getLength());
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