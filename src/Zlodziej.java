import java.util.ArrayList;
import java.util.Random;


public class Zlodziej extends Osoba {
	ArrayList<Komnata> listaKomnat;
	ArrayList<Skarb> listaKradzionych;
	
	Zlodziej(String n, Komnata k){
		super(n, k);
		aktualizujListeKomnat();
		listaKradzionych = new ArrayList<Skarb>();
	}
	void aktualizujListeKomnat(){
		listaKomnat = new ArrayList<Komnata>();
		int i;
		int size = komnata.labirynt.listaPrzejsc.size();
		for(i = 0; i < size; i++){
			if(komnata.equals(komnata.labirynt.listaPrzejsc.get(i).komnata1)){
				if(!(komnata.labirynt.listaPrzejsc.get(i).nazwa.equals("wyjście")))
					listaKomnat.add(komnata.labirynt.listaPrzejsc.get(i).komnata2);
			}
		}
		size = komnata.labirynt.listaDrzwi.size();
		for(i = 0; i < size; i++){
			if(komnata.equals(komnata.labirynt.listaDrzwi.get(i).komnata1)){
				listaKomnat.add(komnata.labirynt.listaDrzwi.get(i).komnata2);
			}
			if(komnata.equals(komnata.labirynt.listaDrzwi.get(i).komnata2)){
				listaKomnat.add(komnata.labirynt.listaDrzwi.get(i).komnata1);
			}
		}
	}
	
	void przejdz(){
		Random rand = new Random();
		komnata = listaKomnat.get(rand.nextInt(listaKomnat.size()));
		aktualizujListeKomnat();
	}
	
	void kradnij(){
		Random rand = new Random();
		if(!(komnata.labirynt.gracz.listaSkarbow.isEmpty())){
			Skarb p = komnata.labirynt.gracz.listaSkarbow.get(rand.nextInt(komnata.labirynt.gracz.listaSkarbow.size()));
			super.wez(p);
			komnata.labirynt.gracz.listaSkarbow.remove(p);
			komnata.labirynt.gracz.majatek -= p.wartosc;
			listaKradzionych.add(p);
			System.out.println("Ojej ! Złodziej właśnie ukradł Ci " + p.nazwa + "!");
		}
	}
	
	void oddaj(){
		if(!(listaKradzionych.isEmpty())){
			Random rand = new Random();
			Skarb p = listaKradzionych.get(rand.nextInt(listaKradzionych.size()));
			p.wlasciciel = komnata.labirynt.gracz;
			komnata.labirynt.gracz.listaSkarbow.add(p);
			listaKradzionych.remove(p);
			System.out.println("Ooo, złodziej ma wyrzuty sumienia i oddaje Ci " + p.nazwa);
		}
	}
}
