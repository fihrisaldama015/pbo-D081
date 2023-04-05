package brt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Halte {
    private int penumpang_naik, penumpang_turun, penumpang_menunggu;
    private ArrayList<Penumpang> history_penumpang = new ArrayList<Penumpang>();
    private String namaHalte;
    private String namaHalteBerikutnya;
    
    public Halte(String namaHalte) {
        this.namaHalte = namaHalte;
        if(namaHalte == "PULL/KANTOR"){
            this.namaHalteBerikutnya = "PORONG";
        }else if(namaHalte == "PORONG"){
            this.namaHalteBerikutnya = "SURABAYA";
        }else if(namaHalte == "SURABAYA"){
            this.namaHalteBerikutnya = "GRESIK";
        }else if(namaHalte == "GRESIK"){
            this.namaHalteBerikutnya = "PULL/KANTOR";
        }
    }

    public void penumpangNaik(int naik) {
        this.penumpang_naik += naik;
        this.penumpang_menunggu -= naik;
    }
    
    public void penumpangTurun(int turun) {
        this.penumpang_turun += turun;
    }

    public void tambahPenumpang(Penumpang penumpang) {
        this.history_penumpang.add(penumpang);
    }

    public void daftarPenumpangNaik() {
        Map<String, Integer> penumpangHalte = new HashMap<String, Integer>();
        penumpangHalte.put("PORONG",0);
        penumpangHalte.put("SURABAYA",0);
        penumpangHalte.put("GRESIK",0);
        penumpangHalte.put("PULL/KANTOR",0);

        for (int i = 0; i < this.penumpang_naik; i++) {
            if(this.history_penumpang.get(i).getHalteTujuan().equals("PORONG")){
                penumpangHalte.put("PORONG", penumpangHalte.get("PORONG")+1);
            }else if(this.history_penumpang.get(i).getHalteTujuan().equals("SURABAYA")){
                penumpangHalte.put("SURABAYA", penumpangHalte.get("SURABAYA")+1);
            }else if(this.history_penumpang.get(i).getHalteTujuan().equals("GRESIK")){
                penumpangHalte.put("GRESIK", penumpangHalte.get("GRESIK")+1);
            }else if(this.history_penumpang.get(i).getHalteTujuan().equals("PULL/KANTOR")){
                penumpangHalte.put("PULL/KANTOR", penumpangHalte.get("PULL/KANTOR")+1);
            }
        }
        for(Map.Entry<String, Integer> entry : penumpangHalte.entrySet()){
            if(entry.getValue() != 0) System.out.println(entry.getValue()+" penumpang tujuan "+entry.getKey());
        }
    }

    public void statusHalte() {
        System.out.print("Halte " + this.namaHalte + " : ");
        System.out.println( this.penumpang_menunggu + " Penumpang Menunggu");
    }

    public void statusPenumpang() {
        System.out.println("Penumpang Turun : " + this.penumpang_turun);
        System.out.println("Penumpang Naik : " + this.penumpang_naik);
        this.daftarPenumpangNaik();
        System.out.println("Halte "+this.namaHalte+" : "+this.penumpang_menunggu+" Penumpang Menunggu");
    }
    
    public String getNamaHalte() {
        return namaHalte;
    }

    public String getNamaHalteBerikutnya() {
        return namaHalteBerikutnya;
    }
    
    public void setPenumpang(int penumpang) {
        this.penumpang_menunggu = penumpang;
    }
}