interface Shape {
    double area();
}

class Rectangle implements Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width  = width;
    }

    public double area() {
        return length * width;
    }
}

class Triangle implements Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base   = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape tri  = new Triangle(8, 6);

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Triangle Area : " + tri.area());
    }
}
