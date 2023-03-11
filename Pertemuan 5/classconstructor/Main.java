package classconstructor;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.println("==============================");
          System.out.println("    Muhamad Fihris Aldama     ");
          System.out.println("         21081010110          ");
          System.out.println("         OOP Kelas D          ");
          System.out.println("     Multiple Constructor     ");
          System.out.println("==============================");

          System.out.println("Pilih Objek");
          System.out.println("1. Kubus");
          System.out.println("2. Balok");
          System.out.println("3. Tabung");
          System.out.println("4. Limas Segi Empat");
          System.out.println("5. Bola");
          System.out.print("Pilihan : ");
          int pilihanObjek = input.nextInt();

          double volume = 0.0;
          int pilihan;
          switch (pilihanObjek) {
               case 1:
                    Kubus kubus;
                    System.out.println("Pilih Variasi Input");
                    System.out.println("1. Sisi");
                    System.out.println("2. Tanpa input (sisi = 1)");
                    System.out.print("Pilihan : ");
                    pilihan = input.nextInt();
                    if (pilihan == 1) {
                         System.out.print("Masukkan sisi : ");
                         double sisi = input.nextDouble();
                         kubus = new Kubus(sisi);
                         kubus.SetSisi(sisi);
                    } else {
                         kubus = new Kubus();
                    }
                    kubus.ComputeAndSetVolume();
                    volume = kubus.GetVolume();
                    break;
               case 2:
                    Balok balok;
                    System.out.println("Pilih Variasi Input");
                    System.out.println("1. Panjang (lebar & tinggi = panjang)");
                    System.out.println("2. Panjang, Lebar (tinggi = lebar)");
                    System.out.println("3. Panjang, Lebar, Tinggi");
                    System.out.println("4. Tanpa input (default = 1)");
                    System.out.print("Pilihan : ");
                    pilihan = input.nextInt();
                    if (pilihan == 1) {
                         System.out.print("Masukkan panjang : ");
                         double panjang = input.nextDouble();
                         balok = new Balok(panjang);
                         balok.setPanjang(panjang);
                    } else if (pilihan == 2) {
                         System.out.print("Masukkan panjang : ");
                         double panjang = input.nextDouble();
                         System.out.print("Masukkan Lebar : ");
                         double lebar = input.nextDouble();
                         balok = new Balok(panjang, lebar);
                         balok.setPanjang(panjang);
                         balok.setLebar(lebar);
                    } else if (pilihan == 3) {
                         System.out.print("Masukkan panjang : ");
                         double panjang = input.nextDouble();
                         System.out.print("Masukkan Lebar : ");
                         double lebar = input.nextDouble();
                         System.out.print("Masukkan Tinggi : ");
                         double tinggi = input.nextDouble();
                         balok = new Balok(panjang, lebar, tinggi);
                         balok.setPanjang(panjang);
                         balok.setLebar(lebar);
                         balok.setTinggi(tinggi);
                    } else {
                         balok = new Balok();
                    }
                    balok.ComputeAndSetVolume();
                    volume = balok.getVolume();
                    break;
               case 3:
                    Tabung tabung;
                    System.out.println("Pilih Variasi Input");
                    System.out.println("1. Radius (tinggi = radius)");
                    System.out.println("2. Radius, Tinggi");
                    System.out.println("3. Tanpa input (default = 1)");
                    System.out.print("Pilihan : ");
                    pilihan = input.nextInt();
                    if (pilihan == 1) {
                         System.out.print("Masukkan radius : ");
                         double radius = input.nextDouble();
                         tabung = new Tabung(radius);
                         tabung.SetRadius(radius);
                    } else if (pilihan == 2) {
                         System.out.print("Masukkan radius : ");
                         double radius = input.nextDouble();
                         System.out.print("Masukkan tinggi : ");
                         double tinggiT = input.nextDouble();
                         tabung = new Tabung(radius, tinggiT);
                         tabung.SetRadius(radius);
                         tabung.SetTinggi(tinggiT);
                    } else {
                         tabung = new Tabung();
                    }
                    tabung.ComputeAndSetVolume();
                    volume = tabung.GetVolume();
                    break;
               case 4:
                    LimasSegiEmpat limas;
                    System.out.println("Pilih Variasi Input");
                    System.out.println("1. Sisi (tinggi = sisi)");
                    System.out.println("2. Sisi, Tinggi");
                    System.out.println("3. Tanpa input (default = 1)");
                    System.out.print("Pilihan : ");
                    pilihan = input.nextInt();
                    if (pilihan == 1) {
                         System.out.print("Masukkan sisi : ");
                         double sisiL = input.nextDouble();
                         limas = new LimasSegiEmpat(sisiL);
                         limas.SetSisi(sisiL);
                    } else if (pilihan == 2) {
                         System.out.print("Masukkan sisi : ");
                         double sisiL = input.nextDouble();
                         System.out.print("Masukkan tinggi : ");
                         double tinggiL = input.nextDouble();
                         limas = new LimasSegiEmpat(sisiL, tinggiL);
                         limas.SetSisi(sisiL);
                         limas.SetTinggi(tinggiL);
                    } else {
                         limas = new LimasSegiEmpat();
                    }
                    limas.ComputeAndSetVolume();
                    volume = limas.GetVolume();
                    break;
               case 5:
                    Bola bola;
                    System.out.println("Pilih Variasi Input");
                    System.out.println("1. Radius");
                    System.out.println("2. Tanpa input (default = 1)");
                    System.out.print("Pilihan : ");
                    pilihan = input.nextInt();
                    if (pilihan == 1) {
                         System.out.print("Masukkan radius : ");
                         double radiusB = input.nextDouble();
                         bola = new Bola(radiusB);
                         bola.SetRadius(radiusB);
                    } else {
                         bola = new Bola();
                    }
                    bola.ComputeAndSetVolume();
                    volume = bola.GetVolume();
                    break;
               default:
                    System.out.println("Pilihan tidak valid!");
                    break;
          }

          System.out.println("========== HASIL ==========");
          System.out.println("Volume = " + volume);
          System.out.println("===========================");
          input.close();
     }
}
