
public class Osoba {
	public String nazwa;
	public Komnata komnata;
	
	public Osoba(String n, Komnata k){
		nazwa = n;
		komnata = k;
	}
	
	public void wez(Przedmiot p){
		p.wlasciciel = this;
		p.komnata = null;
	}
	
	public void odloz(Przedmiot p){
		p.wlasciciel = null;
		p.komnata = this.komnata;
	}

}
