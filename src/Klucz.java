
public class Klucz extends Przedmiot {
	public Drzwi drzwi;
	
	public Klucz(String n, Komnata k, Drzwi d){
		super(n, "To jest klucz do " + d.nazwa + ".", k);
		drzwi = d;
	}
}
