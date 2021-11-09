
public class SuaraAdapter implements Kucing
{
    Bebek bebek;
    
    public SuaraAdapter(Bebek bebek){
        this.bebek = bebek;
    }
    
    @Override 
    public void meow(){
        bebek.kwek(); 
    }
}
