
public class DrinksBarangAdapter implements BarangAdapter
{
    private Drinks drinks; 
    
    public DrinksBarangAdapter(Drinks drinks) {
        this.drinks = drinks;
    }
    
    @Override 
    public String getJenisBarang() {
        return "Nama : " +drinks.getNama() + " \njenis : " + drinks.getJenis() + "\n" +drinks.getNama()+" dimasukkan ke dalam penyimpanan kulkas" ; 
    }
}
