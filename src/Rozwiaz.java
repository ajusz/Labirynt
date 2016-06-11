import java.util.Scanner;


public class Rozwiaz implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "rozwiąż";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 2){
			System.out.println("Niepoprawna instrukcja.");
			return;
		}

		String zadanie = rozkazy[1];
		int i;
		int size = labirynt.listaZadan.size();
		for(i = 0; i < size; i++){
			if(labirynt.listaZadan.get(i).nazwa.equals(zadanie)){
				if(labirynt.listaZadan.get(i).komnata.equals(labirynt.gracz.komnata)){
					labirynt.listaZadan.get(i).rozwiazanie();
				}
				else
					System.out.println("Nie ma takiego zadania w tej komnacie.");
				break;
			}
		}
		if(i == size)
			System.out.println("Nie ma takiego zadania.");
		
	}
}
