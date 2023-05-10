public class Majalah extends Koleksi {
    private String edisi;
    
    public Majalah(String judul, String edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    
    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }
    
    public String getEdisi() {
        return this.edisi;
    }
}