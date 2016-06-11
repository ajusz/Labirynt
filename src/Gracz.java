import java.util.ArrayList;


public class Gracz extends Osoba {
	public int majatek;
	ArrayList<Skarb> listaSkarbow;
	ArrayList<Klucz> listaKluczy;
	
	public Gracz(String n, Komnata k) {
		super(n, k);
		majatek = 0;
		listaSkarbow = new ArrayList<Skarb>();
		listaKluczy = new ArrayList<Klucz>();
	}
	
	public void wez(Przedmiot p){
		super.wez(p);
		if(p instanceof Skarb){
			this.majatek += ((Skarb) p).wartosc;
			listaSkarbow.add((Skarb)p);
		}
		else
			listaKluczy.add((Klucz)p);
	}
	
	public void odloz(Przedmiot p){
		super.odloz(p);
		if(p instanceof Skarb){
			this.majatek -= ((Skarb) p).wartosc;
			listaSkarbow.remove((Skarb)p);
		}
		else
			listaKluczy.remove((Klucz)p);
	}
	
	public void rozejrzyjSie(){
		System.out.println(this.komnata.opis);
		this.komnata.wypiszPrzedmiotyZKomnaty();
		this.komnata.wypiszDrzwiZKomnaty();
		this.komnata.wypiszPrzejsciaZKomnaty();
		this.komnata.wypiszZadaniaZKomnaty();
	}
	
	public void przejdz(Przejscie p){
		
		if(p instanceof Drzwi){
			if(!((Drzwi)p).czyOtwarte)
				System.out.println("Te drzwi są zamknięte.");
			else{
				if(p.komnata1.equals(this.komnata)){
					this.komnata = p.komnata2;
					System.out.println("Przeszedłeś do następnej komnaty.");
				}
				else
					if(p.komnata2.equals(this.komnata)){
						this.komnata = p.komnata1;
						System.out.println("Przeszedłeś do następnej komnaty.");
					}
					else
						System.out.println("Nie ma takich drzwi w tej komnacie.");
			}
		}
		else
			if(p.komnata1.equals(this.komnata)){
				this.komnata = p.komnata2;
				System.out.println("Przeszedłeś do następnej komnaty.");
			}
			else
				System.out.println("W tej komnacie nie ma takiego przejścia.");
	}
	
	void wypiszCoMam(){
		int i;
		int size1 = listaSkarbow.size();
		int size2 = listaKluczy.size();
		
		if(size1 == 0 && size2 == 0){
			System.out.println("Nic nie masz ! :c ");
			return;
		}
		
		if(size1 != 0){
			System.out.println("Twoje skarby to: ");
			for(i = 0; i < size1; i++){
				System.out.println(listaSkarbow.get(i).nazwa);
			}
		}
		if(size2 != 0){
			System.out.println("Twoje klucze to: ");
			for(i = 0; i < size2; i++){
				System.out.println(listaKluczy.get(i).nazwa);
			}
		}
			
	}
}
