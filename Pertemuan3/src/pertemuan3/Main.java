package pertemuan3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("    Muhamad Fihris Aldama     ");
        System.out.println("         21081010110          ");
        System.out.println("         OOP Kelas D          ");
        System.out.println("==============================");

        System.out.println("Pilih Objek");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Ellipse");
        System.out.print("Pilihan : ");
        int pilihanObjek = input.nextInt();

        double keliling = 0.0;
        double luas = 0.0;
        switch (pilihanObjek) {
            case 1:
                System.out.print("Masukkan sisi : ");
                int sisi = input.nextInt();
                Square kotak = new Square(sisi);
                keliling = kotak.calculatePerimeter();
                luas = kotak.calculateArea();
                break;
            case 2:
                System.out.print("Masukkan panjang : ");
                int panjang = input.nextInt();
                System.out.print("Masukkan Lebar : ");
                int lebar = input.nextInt();
                Rectangle persegi_panjang = new Rectangle(panjang, lebar);
                keliling = persegi_panjang.calculatePerimeter();
                luas = persegi_panjang.calculateArea();
                break;
            case 3:
                System.out.print("Masukkan radius : ");
                int radius = input.nextInt();
                Circle lingkaran = new Circle(radius);
                keliling = lingkaran.calculatePerimeter();
                luas = lingkaran.calculateArea();
                break;
            case 4:
                System.out.print("Masukkan Major : ");
                int major = input.nextInt();
                System.out.print("Masukkan Minor : ");
                int minor = input.nextInt();
                Ellipse oval = new Ellipse(major, minor);
                keliling = oval.calculatePerimeter();
                luas = oval.calculateArea();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
        if (keliling != 0.0 && luas != 0.0) {
            System.out.println("========== HASIL ==========");
            System.out.println("Keliling = " + keliling);
            System.out.println("Luas     = " + luas);
            System.out.println("===========================");
        } else {
            System.out.println("System Error");
        }

        input.close();
    }

}
