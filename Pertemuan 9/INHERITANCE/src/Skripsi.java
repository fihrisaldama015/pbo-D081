public class Skripsi extends Buku {
    private String npm;
    
    public Skripsi(String npm, String penulis, String judul, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.npm = npm;
    }
    
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public String getNpm() {
        return this.npm;
    }
}