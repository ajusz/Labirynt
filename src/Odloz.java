
public class Odloz implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "odłóż";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 2){
			System.out.println("Niepoprawna instrukcja.");
			return;
		}
		
		String przedmiot = rozkazy[1];
		int size = labirynt.listaPrzedmiotow.size();
		int i;
		for(i = 0; i < size; i++){
			if(labirynt.listaPrzedmiotow.get(i).nazwa.equals(przedmiot)){
				if(labirynt.listaPrzedmiotow.get(i).wlasciciel != null){
					if(labirynt.listaPrzedmiotow.get(i).wlasciciel.equals(labirynt.gracz)){
						labirynt.gracz.odloz(labirynt.listaPrzedmiotow.get(i));
						if(labirynt.listaPrzedmiotow.get(i) instanceof Skarb)
							System.out.println("Straciłeś skarb o wartosci " + ((Skarb)labirynt.listaPrzedmiotow.get(i)).wartosc + "\n");
						else
							System.out.println("Straciłeś klucz do " + ((Klucz)labirynt.listaPrzedmiotow.get(i)).drzwi.nazwa + "\n");
						break;
					}
					else{
						System.out.println("Nie posiadasz takiego przedmiotu.\n");
						break;
					}
				}
				
			}
		}
		if(i == size)
			System.out.println("Nie posiadasz takiego przedmiotu.\n");			
	}
}
