package classconstructor;

public class Balok {
    private double panjang, lebar, tinggi, volume;

    public Balok() {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }

    public Balok(double sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.tinggi = sisi;
    }

    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = lebar;
    }

    public Balok(double panjang, double lebar, double tinggi) {
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void ComputeAndSetVolume() {
        this.volume = this.panjang * this.lebar * this.tinggi;
        System.out.println("volume = " + this.panjang + " * " + this.lebar + " * " + this.tinggi);
    }

    public double getVolume() {
        return this.volume;
    }
}
