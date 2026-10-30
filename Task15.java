interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, radius * 2, radius * 2);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 10, 5);

        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());
    }
}