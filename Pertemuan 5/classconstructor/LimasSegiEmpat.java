package classconstructor;

public class LimasSegiEmpat {
    private double sisi, tinggi, volume;

    public LimasSegiEmpat() {
        this.sisi = 1;
        this.tinggi = 1;
    }

    public LimasSegiEmpat(double sisi) {
        this.sisi = sisi;
        this.tinggi = 1;
    }

    public LimasSegiEmpat(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public void SetSisi(double sisi) {
        this.sisi = sisi;
    }

    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void ComputeAndSetVolume() {
        this.volume = this.sisi * this.sisi * this.tinggi / 3;
    }

    public double GetVolume() {
        return this.volume;
    }
}
