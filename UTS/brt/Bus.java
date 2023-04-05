package brt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bus {
    private int jumlahPenumpang;
    private String halteTujuan;
    private String halteSekarang;
    private final int kapasitas = 20;
    private boolean statusBerjalan;
    private ArrayList<Penumpang> penumpang;

    public Bus(){
        this.penumpang = new ArrayList<Penumpang>();
        this.jumlahPenumpang = 0;
        this.statusBerjalan = false;
    }

    public void tambahPenumpang(Penumpang penumpang) {
        if (this.jumlahPenumpang + 1 <= this.kapasitas) {
            this.jumlahPenumpang += 1;
        } else {
            System.out.println("Penumpang melebihi kapasitas");
        }

        this.penumpang.add(penumpang);
    }

    public void turunkanPenumpang() {
        if (this.jumlahPenumpang - 1 >= 0) {
            this.jumlahPenumpang -= 1;
        } else {
            System.out.println("Penumpang tidak boleh negatif");
        }
    }

    public void daftarPenumpang() {
        System.out.println("Jumlah penumpang: "+this.jumlahPenumpang + " penumpang");

        Map<String, Integer> penumpangHalte = new HashMap<String, Integer>();
        penumpangHalte.put("PORONG",0);
        penumpangHalte.put("SURABAYA",0);
        penumpangHalte.put("GRESIK",0);

        for (int i = 0; i < this.jumlahPenumpang; i++) {
            if(this.penumpang.get(i).getHalteTujuan().equals("PORONG")){
                penumpangHalte.put("PORONG", penumpangHalte.get("PORONG")+1);
            }else if(this.penumpang.get(i).getHalteTujuan().equals("SURABAYA")){
                penumpangHalte.put("SURABAYA", penumpangHalte.get("SURABAYA")+1);
            }else if(this.penumpang.get(i).getHalteTujuan().equals("GRESIK")){
                penumpangHalte.put("GRESIK", penumpangHalte.get("GRESIK")+1);
            }
        }

        for(Map.Entry<String, Integer> entry : penumpangHalte.entrySet()){
            if(entry.getValue() != 0) System.out.println(entry.getValue()+" penumpang turun di HALTE "+entry.getKey());
        }
    }

    public void jalankanBus() {
        this.statusBerjalan = true;
        System.out.println("BUS berangkat dari "+this.halteSekarang+" menuju "+this.halteTujuan);
    }

    public void hentikanBus(Halte halte) {
        this.statusBerjalan = false;
        System.out.println("BUS sampai di HALTE "+this.halteTujuan);
        for(int i = 0; i < this.jumlahPenumpang; i++){
            if(penumpang.get(i).getHalteTujuan().equals(halte.getNamaHalte())){
                this.turunkanPenumpang();
                halte.penumpangTurun(1);
                penumpang.remove(i);
            }
        }   
    }

    public int getJumlahPenumpang() {
        return this.jumlahPenumpang;
    }

    public String getHalteSekarang() {
        return this.halteSekarang;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public boolean getStatusBerjalan() {
        return this.statusBerjalan;
    }

    public void setHalte(Halte halte) {
        this.halteSekarang = halte.getNamaHalte();
        this.halteTujuan = halte.getNamaHalteBerikutnya();
    }
}
