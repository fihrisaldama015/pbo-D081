package pertemuan3;

public class Square {

    public int SideLength;

    public Square(int sisi) {
        this.SideLength = sisi;
    }

    public double calculatePerimeter() {
        return this.SideLength * 4;
    }

    public double calculateArea() {
        return this.SideLength * this.SideLength;
    }
}
