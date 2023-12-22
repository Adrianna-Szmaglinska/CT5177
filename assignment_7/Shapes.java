package assignment_7;

import java.io.Serializable;

abstract class Shapes implements ShapesRelate, Serializable {
    private static final long serialVersionUID = 1L;
    protected double area;

    // Constructor initializes area to 0
    Shapes() {
        this.area = 0;
    }

    // Getter for area
    double getArea() {
        return area;
    }

    // Abstract method to calculate area, implemented by subclasses
    abstract void calculateArea();

    // Method to compare shapes based on area, used for sorting
    @Override
    public int compareShapes(ShapesRelate other) {
        if (other instanceof Shapes) {
            return Double.compare(this.getArea(), ((Shapes) other).getArea());
        }
        // Handle the case when comparing with a different shape type
        return getClass().getName().compareTo(other.getClass().getName());
    }
}
