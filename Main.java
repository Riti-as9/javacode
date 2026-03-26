// Point class
class Point {
    int x;
    int y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display point
    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

// Circle class
class Circle {
    double radius;
    Point center;  // Object of Point class

    // Constructor
    Circle(double radius, int x, int y) {
        this.radius = radius;
        center = new Point(x, y);  // Composition
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    void displayCircle() {
        System.out.println("Radius: " + radius);
        center.displayPoint();
        System.out.println("Area of Circle: " + calculateArea());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, 2, 3);
        c.displayCircle();
    }
}