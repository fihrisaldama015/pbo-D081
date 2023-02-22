package com.aldam.pertemuan_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pegawai: ");
        String nama = input.nextLine();

        System.out.print("Masukkan alamat pegawai: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan pengalaman pegawai (pemula | menengah | expert): ");
        String pengalaman = input.nextLine();

        System.out.print("Masukkan skill pegawai (web | mobile | desktop): ");
        String skill = input.nextLine();

        System.out.print("Masukkan departemen pegawai (IT | HRD | Finance): ");
        String department = input.nextLine();

        Karyawan employee = new Karyawan(nama, alamat, pengalaman, skill, department);
        int gaji = employee.hitungGaji();

        System.out.println("=========== HASIL ===========");
        System.out.println("Nama       = " + nama);
        System.out.println("Alamat     = " + alamat);
        System.out.println("Departemen = " + department);
        System.out.println("Pengalaman = " + pengalaman);
        System.out.println("Skill      = " + skill);
        if (gaji != -1) {
            System.out.println("Gaji       = Rp." + gaji + ",00");
        }
        System.out.println("=============================");
        input.close();
    }
}
