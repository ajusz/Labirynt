
public class WypiszCoMam implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "wypisz";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 3){
			System.out.println("Niepoprawna instrukcja.");
			return;
		}

		if(rozkazy[1].equals("co") && rozkazy[2].equals("mam"))
			labirynt.gracz.wypiszCoMam();
		else
			System.out.println("Niepoprawna instrukcja.");

	}
}
