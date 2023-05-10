public class Buku extends Koleksi {
    private String penulis;
    
    public Buku(String judul, String penulis, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }
    
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public String getPenulis() {
        return this.penulis;
    }
}