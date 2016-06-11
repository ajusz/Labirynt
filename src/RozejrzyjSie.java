
public class RozejrzyjSie implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "rozejrzyj";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 2 ){
			System.out.println("Niepoprawna instrukcja.");
			return;
		}

		if(rozkazy[1].equals("się"))
			labirynt.gracz.rozejrzyjSie();
		else
			System.out.println("Niepoprawna instrukcja.");
	}

}
