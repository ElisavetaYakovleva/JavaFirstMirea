package Lab2;
public class Kryggg {
    // Private variables
    private double radius;
    private String color;


    public Kryggg() {
        radius = 1.0;
        color = "red";
    }
    public Kryggg(double r) {
        radius = r;
        color = "green";
    }
    public Kryggg(double r, String c) {
        radius = r;
        color = c;
    }

    // Public methods
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
