
public class Zamknij implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "zamknij";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 2){
			System.out.println("Niepoprawna instrukcja.");
			return;
		}

		String drzwi = rozkazy[1];
		int size = labirynt.listaDrzwi.size();
		int i;
		for(i = 0; i < size; i++){
			if(labirynt.listaDrzwi.get(i).nazwa.equals(drzwi)){
				if(labirynt.listaDrzwi.get(i).komnata1.equals(labirynt.gracz.komnata) || labirynt.listaDrzwi.get(i).komnata2.equals(labirynt.gracz.komnata)){
					int size1 = labirynt.listaPrzedmiotow.size();
					int j;
					for(j=0; j < size1; j++){
						if(labirynt.listaPrzedmiotow.get(j).wlasciciel != null){
							if((labirynt.listaPrzedmiotow.get(j) instanceof Klucz) && labirynt.listaPrzedmiotow.get(j).wlasciciel.equals(labirynt.gracz) && ((Klucz)labirynt.listaPrzedmiotow.get(j)).drzwi.nazwa.equals(drzwi)){
								labirynt.listaDrzwi.get(i).zamknij();
								System.out.println("Udało Ci się zamknąć " + labirynt.listaDrzwi.get(i).nazwa + ".\n");
								break;
							}
						}
					}
					if(j == size1)
						System.out.println("Nie posiadasz klucza do tych drzwi.\n");
				}
				else{
					System.out.println("Takich drzwi nie ma w tej komnacie.\n");
				}	
				break;
			}
		}
		if(i == size)
			System.out.println("Nie ma takich drzwi w tym labiryncie.\n");
	}
}
