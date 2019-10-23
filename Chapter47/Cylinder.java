public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return (radius * radius) * Math.PI * height;
    }

    public double surfaceArea() {
        return (((radius * radius) * Math.PI) * 2) + (2 * (Math.PI * radius * height));
    }
}