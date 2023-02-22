package pertemuan3;

public class Ellipse {
    public int major;
    public int minor;

    public Ellipse(int major, int minor) {
        this.major = major;
        this.minor = minor;
    }

    public double calculateArea() {
        return 3.14 * this.major * this.minor;
    }

    public double calculatePerimeter() {
        return 3.14 * (this.major + this.minor);
    }
}
