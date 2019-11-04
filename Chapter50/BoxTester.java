class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

        Box box2 = new Box(box);
        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("Length: " + box.getLength() + " height: " + box.getHeight() + " width: " + box.getWidth());
        System.out.println("Face Area: " + box.faceArea() + " Top Area: " + box.topArea() + " Side Area: " + box.sideArea());
    }
}