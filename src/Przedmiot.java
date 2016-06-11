
public class Przedmiot {
	public String nazwa;
	public String opis;
	public Osoba wlasciciel;
	public Komnata komnata;
	
	public Przedmiot(String n, Komnata k){
		nazwa = n;
		opis = "";
		wlasciciel = null;
		komnata = k;
	}
	
	public Przedmiot(String n, String o, Komnata k){
		nazwa = n;
		opis = o;
		wlasciciel = null;
		komnata = k;
	}
	
	public void sprawdz(){
		System.out.println(opis);
	}
	
}
