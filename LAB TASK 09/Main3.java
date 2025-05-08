interface Draw {
    void draw();
}

interface Shape extends Draw {
    void shapeType();
    double calculateArea();
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void shapeType() {
        System.out.println("Shape: Rectangle");
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;
    final double PI = 3.14159;

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void shapeType() {
        System.out.println("Shape: Circle");
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

class Square implements Shape {
    double length;

    Square(double length) {
        this.length = length;
    }

    public void draw() {
        System.out.println("Drawing Square");
    }

    public void shapeType() {
        System.out.println("Shape: Square");
    }

    public double calculateArea() {
        return length * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        Square square = new Square(6);

        rectangle.draw();
        rectangle.shapeType();
        System.out.println("Area: " + rectangle.calculateArea());

        circle.draw();
        circle.shapeType();
        System.out.println("Area: " + circle.calculateArea());

        square.draw();
        square.shapeType();
        System.out.println("Area: " + square.calculateArea());
    }
}
