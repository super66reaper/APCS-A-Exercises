class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("Length: " + box.getLength() + " height: " + box.getHeight() + " widthL " + box.getWidth());
    }
}