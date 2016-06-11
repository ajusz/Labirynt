
public class Komnata {
	public int numer;
	public String opis;
	public Labirynt labirynt;
	
	public Komnata(int n, Labirynt l){
		numer = n;
		opis = "";
		labirynt = l;
	}
	
	public Komnata(int n, String o, Labirynt l){
		numer = n;
		opis = o;
		labirynt = l;
	}
	
	void wypiszPrzedmiotyZKomnaty(){
		int size = labirynt.listaPrzedmiotow.size();
		String s = "";
		for(int i = 0; i < size; i++){
			if(labirynt.listaPrzedmiotow.get(i).komnata != null){
				if(labirynt.listaPrzedmiotow.get(i).komnata.equals(this))
					s += labirynt.listaPrzedmiotow.get(i).nazwa + "\n"; 
			}
		}
		if(s != "")
			System.out.println("W tej komnacie znajdują się następujące przedmioty:\n" + s);
		else
			System.out.println("W tej komnacie nie ma żadnych przedmiotów.");
	}
	
	void wypiszZadaniaZKomnaty(){
		int size = labirynt.listaZadan.size();
		String s = "";
		for(int i = 0; i < size; i++){
			if(labirynt.listaZadan.get(i).komnata != null){
				if(labirynt.listaZadan.get(i).komnata.equals(this))
					s += labirynt.listaZadan.get(i).nazwa + "\n"; 
			}
		}
		if(s != "")
			System.out.println("W tej komnacie znajdują się zadania o podanych nazwach:\n" + s);
		else
			System.out.println("W tej komnacie nie ma żadnych zadań.");
	}
	
	void wypiszPrzejsciaZKomnaty(){
		int size = labirynt.listaPrzejsc.size();
		String s = "";
		for(int i = 0; i < size; i++){
			if(labirynt.listaPrzejsc.get(i).komnata1.equals(this))
				s += labirynt.listaPrzejsc.get(i).nazwa + "\n"; 
		}
		if(s != "")
			System.out.println("W tej komnacie są następujące przejścia:\n" + s);
		else
			System.out.println("W tej komnacie nie ma żadnych przejść.");
	}
	
	void wypiszDrzwiZKomnaty(){
		int size = labirynt.listaDrzwi.size();
		String s = "";
		for(int i = 0; i < size; i++){
			if(labirynt.listaDrzwi.get(i).komnata1.equals(this)){
				s += labirynt.listaDrzwi.get(i).nazwa; 
				if(labirynt.listaDrzwi.get(i).czyOtwarte)
					s += " - otwarte\n";
				else 
					s += " - zamknięte\n";
			}
			else
				if(labirynt.listaDrzwi.get(i).komnata2.equals(this)){
					s += labirynt.listaDrzwi.get(i).nazwa; 
					if(labirynt.listaDrzwi.get(i).czyOtwarte)
						s += " - otwarte\n";
					else 
						s += " - zamknięte\n";
				}
		}
		if(s != "")
			System.out.println("W tej komnacie sa następujące drzwi:\n" + s);
		else
			System.out.println("W tej komnacie nie ma żadnych drzwi.");
	}

}
