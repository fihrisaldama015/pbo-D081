package pertemuan3;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int panjang, int lebar) {
        this.width = lebar;
        this.height = panjang;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return 2 * (this.height * this.width);
    }
}
