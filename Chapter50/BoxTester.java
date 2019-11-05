class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);
        printMessages(box);
        Box box2 = new Box(box, "bigger");
        printMessages(box2);
        Box box3 = new Box(box, "smaller");
        printMessages(box3);
     
        checkNest(box, box2);
        checkNest(box, box3);
        checkNest(box2, box3);
    }
    public static void printMessages(Box box) {
        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("Length: " + box.getLength() + " height: " + box.getHeight() + " width: " + box.getWidth());
        System.out.println("Face Area: " + box.faceArea() + " Top Area: " + box.topArea() + " Side Area: " + box.sideArea());
    }

    public static void checkNest(Box box1, Box box2) {
        if (box1.nests(box2)) {
            System.out.println("Box 1 fits into box 2"); 
        }else {
            System.out.println("Box 1 does not fit into box 2"); 
        }
    }
}