
public class SnacksBarangAdapter implements BarangAdapter
{
    private Snacks snacks; 
    
    public SnacksBarangAdapter(Snacks snacks) {
        this.snacks = snacks;
    }
    
    @Override 
    public String getJenisBarang() {
        return "Nama : " +snacks.getNama() + "\njenis : " +snacks.getJenis() + "\n" +snacks.getNama()+ " dimasukkan ke dalam penyimpanan lemari"; 
    }
}
