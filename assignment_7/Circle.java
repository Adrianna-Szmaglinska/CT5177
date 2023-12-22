package assignment_7;

import java.io.Serializable;

class Circle extends Shapes implements Serializable {
    private static final long serialVersionUID = 1L;
    private double radius;
    private static final double PI = 3.14159;

    // Constructors for Circle class
    Circle() {
        this.radius = 0;
    }
    Circle(double radius) {
        this.radius = radius;
    }

    // Setter and getter for radius
    void setRadius(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }

    // Method to calculate area for a circle
    @Override
    void calculateArea() {
        this.area = PI * radius * radius;
    }

    // Method to compare circles based on area
    @Override
    public int compareShapes(ShapesRelate other) {
        if (!(other instanceof Circle)) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        Circle otherCircle = (Circle) other;
        return Double.compare(this.getArea(), otherCircle.getArea());
    }

    // toString method to display circle details
    @Override
    public String toString() {
        return String.format("Circle - Radius: %.2f, Area: %.5f", radius, area);
    }
}