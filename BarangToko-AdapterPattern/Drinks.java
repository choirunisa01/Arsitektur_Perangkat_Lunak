
public class Drinks{

    private String nama;
    private String jenis; 
    
    public Drinks(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis; 
    }

    public void setNama(String nama) {
        this.nama = nama; 
    }
}
