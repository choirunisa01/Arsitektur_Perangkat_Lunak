import java.util.ArrayList;
import java.util.List;

public class AdapterBarangToko{
    public static void main(String[] args) {
        List<BarangAdapter> list = new ArrayList<>();
        
        list.add(new SnacksBarangAdapter(new Snacks ("Beng-Beng", "Makanan Ringan")));
        list.add(new DrinksBarangAdapter(new Drinks ("Teh Botol", "Minuman"))); 
        
        list.forEach(item -> {
            System.out.println(item.getJenisBarang());
            System.out.println("=================================================");
        });
    }
}
