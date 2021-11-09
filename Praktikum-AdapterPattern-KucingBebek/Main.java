
public class Main
{
    public static void main(String args[]){ 
        
        Kucing cat = new SuaraKucing(); 
        Bebek duck = new SuaraBebek(); 
        
        Bebek bebek = new SuaraBebek();
        Kucing change = new SuaraAdapter(bebek);
        
        System.out.println("Di sebuah pekarangan rumah");
        System.out.println("-----------------------------------------" );
        System.out.println("Kucing sedang bernyanyi dengan suara : ");
        cat.meow(); 
        System.out.println("");
        
        System.out.println("Lalu datang Bebek ikut bernyanyi dengan suara : ");
        duck.kwek(); 
        System.out.println("");
        
        System.out.println("Kucing penasaran dan ikut menirukan suara bebek : ");
        change.meow(); 
       
    }
    
}
