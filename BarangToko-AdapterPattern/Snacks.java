
public class Snacks{

    private String jenis; 
    private String nama;
    
    public Snacks(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis; 
    }

    public void setNama(String nama) {
        this.nama = nama; 
    }
}
