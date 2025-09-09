package hw_6_2.task_1;

public class Circle extends Figure {
    private double radius;
    public static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }
}
