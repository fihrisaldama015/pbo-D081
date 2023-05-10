public class Main {
    public static void main(String[] args) {
        Koleksi koleksi = new Koleksi("Tenggelamnya Kapal van der Wijck", "Centrale Courant", 1939);
        System.out.println("My Koleksi");
        System.out.println("Judul :"+koleksi.getJudul());
        System.out.println("Penerbit : "+koleksi.getPenerbit());
        System.out.println("Tahun Terbit : "+koleksi.getTahun());

        Buku buku = new Buku("Tenggelamnya Kapal van der Wijck", "Hamka", "Centrale Courant", 1939);
        System.out.println("\nMy Buku");
        System.out.println("Judul :"+buku.getJudul());
        System.out.println("Penulis : "+buku.getPenulis());
        System.out.println("Penerbit : "+buku.getPenerbit());
        System.out.println("Tahun Terbit : "+buku.getTahun());

        Majalah majalah = new Majalah("Just for Kids", "ED 05 2021", "MNI global", 2021);
        System.out.println("\nMy Majalah");
        System.out.println("Judul :"+majalah.getJudul());
        System.out.println("Edisi : "+majalah.getEdisi());
        System.out.println("Penerbit : "+majalah.getPenerbit());
        System.out.println("Tahun Terbit : "+majalah.getTahun());

        Skripsi skripsi = new Skripsi("21081010110", "Muhamad Fihris Aldama", "My Skripsi", "UPN Veteran Jatim", 2025);
        System.out.println("\nMy Skripsi");
        System.out.println("Judul :"+skripsi.getJudul());
        System.out.println("NPM : "+skripsi.getNpm());
        System.out.println("Penulis : "+skripsi.getPenulis());
        System.out.println("Penerbit : "+skripsi.getPenerbit());
        System.out.println("Tahun Terbit : "+skripsi.getTahun());
    }
}
