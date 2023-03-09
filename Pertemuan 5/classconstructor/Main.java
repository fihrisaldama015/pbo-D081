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
          switch (pilihanObjek) {
               case 1:
                    System.out.print("Masukkan sisi : ");
                    double sisi = input.nextDouble();
                    Kubus kubus = new Kubus(sisi);
                    kubus.ComputeAndSetVolume();
                    volume = kubus.GetVolume();
                    break;
               case 2:
                    System.out.print("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    double tinggi = input.nextDouble();
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    balok.ComputeAndSetVolume();
                    volume = balok.getVolume();
                    break;
               case 3:
                    System.out.print("Masukkan radius : ");
                    double radius = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double tinggiT = input.nextDouble();
                    Tabung tabung = new Tabung(radius, tinggiT);
                    tabung.ComputeAndSetVolume();
                    volume = tabung.GetVolume();
                    break;
               case 4:
                    System.out.print("Masukkan sisi : ");
                    double sisiL = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double tinggiL = input.nextDouble();
                    LimasSegiEmpat limas = new LimasSegiEmpat(sisiL, tinggiL);
                    limas.ComputeAndSetVolume();
                    volume = limas.GetVolume();
                    break;
               case 5:
                    System.out.print("Masukkan radius : ");
                    double radiusB = input.nextDouble();
                    Bola bola = new Bola(radiusB);
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
