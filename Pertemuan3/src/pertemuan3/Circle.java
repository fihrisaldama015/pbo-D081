package pertemuan3;

public class Circle {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * this.radius * this.radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * this.radius;
    }
}
