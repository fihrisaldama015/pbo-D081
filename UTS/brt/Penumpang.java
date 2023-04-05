package brt;

public class Penumpang {
    private String halteTujuan;

    public Penumpang(String halteTujuan) {
        this.halteTujuan = halteTujuan;
    }

    public void naikKeBus(Bus bus, Halte halte) {
        if(bus.getStatusBerjalan()){
            System.out.println("Bus sedang berjalan");
            return;
        }
        if (bus.getJumlahPenumpang() < bus.getKapasitas()) {
            bus.tambahPenumpang(this);
        } else {
            System.out.println("Bus sudah penuh");
        }

        if(bus.getHalteSekarang() == halte.getNamaHalte()) {
            halte.penumpangNaik(1);
        }
    }

    public String getHalteTujuan() {
        return this.halteTujuan;
    }
}
