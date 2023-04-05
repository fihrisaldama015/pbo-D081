package brt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------") ;
        System.out.println("     OUTPUT Bus Rapid Transit (BRT)");
        System.out.println("          Muhamad Fihris Aldama");
        System.out.println("               21081010110");
        System.out.println("              PBO D081 - UTS");
        System.out.println("--------------------------------------------") ;
        ArrayList<String> NamaHalte = new ArrayList<>();
        NamaHalte.add("PULL/KANTOR");
        NamaHalte.add("PORONG");
        NamaHalte.add("SURABAYA");
        NamaHalte.add("GRESIK");

        Halte pull_kantor = new Halte(NamaHalte.get(0));
        Halte halte_porong = new Halte(NamaHalte.get(1));
        Halte halte_surabaya = new Halte(NamaHalte.get(2));
        Halte halte_gresik = new Halte(NamaHalte.get(3));
        
        // Inisialisasi BUS
        Bus bus = new Bus();
        
        // BUS dari PULL/kantor
        bus.setHalte(pull_kantor);
        for(int i = 0; i < 5; i++) {
            int randomHalte = (int) (Math.random() * 3) + 1;
            Penumpang penumpang = new Penumpang(NamaHalte.get(randomHalte));
            penumpang.naikKeBus(bus, pull_kantor);
        }
        bus.jalankanBus();
        bus.daftarPenumpang();

        System.out.println("--------------------------------------------");

        // BUS dari PORONG
        bus.hentikanBus(halte_porong);
        bus.setHalte(halte_porong);

        int randomPenumpang = (int) (Math.random() * 10) + 1;
        halte_porong.setPenumpang(randomPenumpang);
        halte_porong.statusHalte();
        for(int i = 0; i < randomPenumpang; i++) {
            int randomHalte = (int) (Math.random() * 2) + 2;
            Penumpang penumpang = new Penumpang(NamaHalte.get(randomHalte));
            penumpang.naikKeBus(bus, halte_porong);
            halte_porong.tambahPenumpang(penumpang);
        }
        halte_porong.statusPenumpang();

        System.out.println("--------------------------------------------");

        // BUS dari SURABAYA
        bus.hentikanBus(halte_surabaya);
        bus.setHalte(halte_surabaya);

        randomPenumpang = (int) (Math.random() * 10) + 1;
        halte_surabaya.setPenumpang(randomPenumpang);
        halte_surabaya.statusHalte();
        for(int i = 0; i < randomPenumpang; i++) {
            int randomHalte = (int) (Math.random() * 1) + 3;
            Penumpang penumpang = new Penumpang(NamaHalte.get(randomHalte));
            penumpang.naikKeBus(bus, halte_surabaya);
            halte_surabaya.tambahPenumpang(penumpang);
        }
        halte_surabaya.statusPenumpang();

        System.out.println("--------------------------------------------");

        // BUS dari GRESIK
        bus.hentikanBus(halte_gresik);
        bus.setHalte(halte_gresik);
        randomPenumpang = (int) (Math.random() * 10) + 1;
        halte_gresik.setPenumpang(randomPenumpang);
        halte_gresik.statusHalte();
        for(int i = 0; i < randomPenumpang; i++) {
            int randomHalte = (int) (Math.random() * 3);
            Penumpang penumpang = new Penumpang(NamaHalte.get(randomHalte));
            penumpang.naikKeBus(bus, halte_gresik);
            halte_gresik.tambahPenumpang(penumpang);
        }
        halte_gresik.statusPenumpang();
    }
    
}
