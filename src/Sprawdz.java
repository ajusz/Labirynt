
public class Sprawdz implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "sprawdź";
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
				if(labirynt.listaPrzedmiotow.get(i).komnata != null){
					if(labirynt.listaPrzedmiotow.get(i).komnata.equals(labirynt.gracz.komnata)){
						labirynt.listaPrzedmiotow.get(i).sprawdz();
						break;
					}
				}
				else{
					if(labirynt.listaPrzedmiotow.get(i).wlasciciel.equals(labirynt.gracz)){
						labirynt.listaPrzedmiotow.get(i).sprawdz();
						System.out.println("Ten przedmiot należy do Ciebie.");
					}
					else
						System.out.println("Ktoś inny posiada ten przedmiot. Nie masz do niego dostępu.");
					break;
				}
					
			}
		}
		if(i == size)
			System.out.println("Nie ma takiego przedmiotu w tej komnacie.");

	}
}
