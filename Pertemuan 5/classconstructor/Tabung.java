package classconstructor;

public class Tabung {
    private double radius, tinggi, volume;
    private final double phi = 22 / 7;

    public Tabung() {
        this.radius = 1;
        this.tinggi = 1;
    }

    public Tabung(double radius) {
        this.radius = radius;
        this.tinggi = 1;
    }

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void ComputeAndSetVolume() {
        this.volume = (this.phi * this.radius * this.radius) * this.tinggi;
    }

    public double GetVolume() {
        return this.volume;
    }
}
