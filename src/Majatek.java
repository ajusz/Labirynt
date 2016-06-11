
public class Majatek implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "majątek";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 1)
			System.out.println("Niepoprawna instrukcja.");
		else
			System.out.println("Wartość Twojego majątku wynosi " + labirynt.gracz.majatek);
	}

}
