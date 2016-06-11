
public class Koniec implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "koniec";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 1)
			System.out.println("Niepoprawna instrukcja.");
		else
			labirynt.koniecGry = true;
	}
}
