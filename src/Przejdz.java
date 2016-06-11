import java.util.Random;


public class Przejdz implements Polecenie {

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return "przejdź";
	}

	@Override
	public void wykonaj(Labirynt labirynt, String[] rozkazy) {
		// TODO Auto-generated method stub
		if(rozkazy.length != 2){
			System.out.println("Niepoprawna instrukcja.");
			return;
		}

		String przejscie = rozkazy[1];
		if(przejscie.equals("wyjście")){
			if(labirynt.gracz.majatek >= labirynt.lapowka){
				labirynt.koniecGry = true;
				System.out.println("Gratulacje ! Udało Ci się wydostać z labiryntu !");
			}
			else{
				System.out.println("Nie masz wystarczająco dużo majątku, by przekupić strażnika i wydostać się z labiryntu.");
				System.out.println("Poszukaj więcej skarbów i zadań w labiryncie, dzięki którym się wzbogacisz.");
			}
			return;
		}

		int size = labirynt.listaPrzejsc.size();
		int i;
		for(i = 0; i < size; i++){
			if(labirynt.listaPrzejsc.get(i).nazwa.equals(przejscie)){
				labirynt.gracz.przejdz(labirynt.listaPrzejsc.get(i));
				int size2 = labirynt.listaZlodziei.size();
				for(int k = 0; k < size2; k++){
					labirynt.listaZlodziei.get(k).przejdz();
					if(labirynt.listaZlodziei.get(k).komnata.equals(labirynt.gracz.komnata)){
						Random rand = new Random();
						if(labirynt.listaZlodziei.get(k).listaKradzionych == null || rand.nextInt(1) == 0){
							labirynt.listaZlodziei.get(k).kradnij();
						}
						else
							labirynt.listaZlodziei.get(k).oddaj();
					}
				}
				break;
			}
		}
		if(i == size){
			String drzwi = przejscie;
			int size1 = labirynt.listaDrzwi.size();
			int j;
			for(j = 0; j < size1; j++){
				if(labirynt.listaDrzwi.get(j).nazwa.equals(drzwi)){
						labirynt.gracz.przejdz(labirynt.listaDrzwi.get(j));
						int size2 = labirynt.listaZlodziei.size();
						for(int k = 0; k < size2; k++){
							labirynt.listaZlodziei.get(k).przejdz();
							if(labirynt.listaZlodziei.get(k).komnata.equals(labirynt.gracz.komnata)){
								Random rand = new Random();
								if(labirynt.listaZlodziei.get(k).listaKradzionych == null || rand.nextInt(2) < 2){
									labirynt.listaZlodziei.get(k).kradnij();
								}
								else
									labirynt.listaZlodziei.get(k).oddaj();
							}
						}
						break;
				}
			}
			if(j == size1){
				System.out.println("Nie ma takiego przejścia ani drzwi.\n");
			}
		}
	}
}

