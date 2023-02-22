package com.aldam.pertemuan_3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang Square: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan panjang Rectangle: ");
        int panjangRectangle = input.nextInt();
        System.out.print("Masukkan lebar Rectangle: ");
        int lebarRectangle = input.nextInt();

        Square kotak = new Square(panjang);
        Rectangle persegi_panjang = new Rectangle(panjangRectangle, lebarRectangle);

        System.out.println("=========== HASIL ===========");
        System.out.println("           SQUARE");
        System.out.println("Keliling   = "+kotak.calculatePerimeter());
        System.out.println("Luas       = "+kotak.calculateArea());
        System.out.println("           RECTANGLE");
        System.out.println("Keliling   = "+persegi_panjang.calculatePerimeter());
        System.out.println("Luas       = "+persegi_panjang.calculateArea());
        System.out.println("=============================");
        input.close();
    }
}