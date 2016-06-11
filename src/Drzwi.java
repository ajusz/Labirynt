
public class Drzwi extends Przejscie{
	public boolean czyOtwarte;
	
	public Drzwi(String n, Komnata k1, Komnata k2){
		super(n, k1, k2);
		czyOtwarte = false;
	}
	
	public void otworz(){
		this.czyOtwarte = true;
	}
	
	public void zamknij(){
		this.czyOtwarte = false;
	}
}
