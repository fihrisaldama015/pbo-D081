package classconstructor;

public class Kubus {
    private double sisi, volume;

    public Kubus() {
        this.sisi = 1;
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public void SetSisi(Double sisi) {
        this.sisi = sisi;
    }

    public void ComputeAndSetVolume() {
        this.volume = this.sisi * this.sisi * this.sisi;
    }

    public double GetVolume() {
        return this.volume;
    }
}
