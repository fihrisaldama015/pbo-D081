package com.aldam.pertemuan_1;

public class Karyawan {
    private String nama;
    private String alamat;
    private String pengalaman;
    private String skill;
    private String department;

    public Karyawan(String nama, String alamat, String pengalaman, String skill, String department) {
        this.nama = nama;
        this.alamat = alamat;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.department = department;
    }

    public int hitungGaji() {
        int salary = 0;

        switch (this.department) {
            case "IT":
                salary += 8000000;
                break;
            case "HRD":
                salary += 5000000;
                break;
            case "Finance":
                salary += 4000000;
                break;
            default:
                System.out.println("Departemen tidak dikenal");
                return -1;
        }

        switch (this.pengalaman) {
            case "pemula":
                salary += 500000;
                break;
            case "menengah":
                salary += 1000000;
                break;
            case "expert":
                salary += 2000000;
                break;
            default:
                System.out.println("Pengalaman tidak dikenal");
                return -1;
        }

        switch (this.skill) {
            case "web":
                salary += 1000000;
                break;
            case "mobile":
                salary += 2000000;
                break;
            case "desktop":
                salary += 2500000;
                break;
            default:
                System.out.println("Skill tidak dikenal");
                return -1;
        }

        return salary;
    }

}