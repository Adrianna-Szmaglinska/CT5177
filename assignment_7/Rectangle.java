package assignment_7;

import java.io.Serializable;

class Rectangle extends Shapes implements Serializable {
    private static final long serialVersionUID = 1L;
    private double length;
    private double width;

    // Constructors for Rectangle class
    Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setters and getters for length and width
    void setWidth(double width) {
        this.width = width;
    }
    double getWidth() {
        return width;
    }
    void setLength(double length) {
        this.length = length;
    }
    double getLength() {
        return length;
    }

    // Method to calculate area for a rectangle
    @Override
    void calculateArea() {
        this.area = length * width;
    }

    // Method to compare rectangles based on area
    @Override
    public int compareShapes(ShapesRelate other) {
        if (!(other instanceof Rectangle)) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        Rectangle otherRectangle = (Rectangle) other;
        return Double.compare(this.getArea(), otherRectangle.getArea());
    }

    // toString method to display rectangle details
    @Override
    public String toString() {
        return String.format("Rectangle - Length: %.2f, Width: %.2f, Area: %.2f", length, width, area);
    }
}