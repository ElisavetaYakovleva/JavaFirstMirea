package Lab2;
public class TestKryg { // Save as "TestCircle.java"
    public static void main(String[] args) { // Execution entry point
        // Construct an instance of the Circle class called c1
        Kryggg c1 = new Kryggg(2.0, "blue"); // Use 3rd constructor
        System.out.println("Radius is " + c1.getRadius()
                        + " Color is " + c1.getColor()
                        + " Area is " + c1.getArea());


        Kryggg c2 = new Kryggg(2.0);
        System.out.println("Radius is " + c2.getRadius()
                + " Color is " + c2.getColor()
                + " Area is " + c2.getArea());


        Kryggg c3 = new Kryggg();
        System.out.println("Radius is " + c3.getRadius()
                + " Color is " + c3.getColor()
                + " Area is " + c3.getArea());
    }
}