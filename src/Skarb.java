
public class Skarb extends Przedmiot {
	public int wartosc;
	
	public Skarb(String n, Komnata k, int war){
		super(n, k);
		wartosc = war;
	}
	
	public Skarb(String n, String o, Komnata k, int war){
		super(n, o, k);
		wartosc = war;
	}
}
