
public class Wez implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "weź";
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
				if(labirynt.listaPrzedmiotow.get(i).komnata.equals(labirynt.gracz.komnata)){
					labirynt.gracz.wez(labirynt.listaPrzedmiotow.get(i));
					if(labirynt.listaPrzedmiotow.get(i) instanceof Skarb)
						System.out.println("Zdobyłeś skarb o wartosci " + ((Skarb)labirynt.listaPrzedmiotow.get(i)).wartosc + ".");
					else
						System.out.println("Teraz posiadasz klucz do " + ((Klucz)labirynt.listaPrzedmiotow.get(i)).drzwi.nazwa + ".");
				}
				break;
			}
		}
		if(i == size)
			System.out.println("Nie ma takiego przedmiotu w tej komnacie.");
	}
}
