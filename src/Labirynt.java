import java.util.ArrayList;
import java.util.Scanner;


public class Labirynt {
	
	public ArrayList<Komnata> listaKomnat;
	public ArrayList<Przejscie> listaPrzejsc;
	public ArrayList<Drzwi> listaDrzwi;
	public ArrayList<Zlodziej> listaZlodziei;
	public ArrayList<Przedmiot> listaPrzedmiotow;
	public ArrayList<Zadanie> listaZadan;
	public Gracz gracz;
	public boolean koniecGry;
	int lapowka;
	
	public Labirynt() {
		listaKomnat = new ArrayList<Komnata>() ;
		listaPrzejsc = new ArrayList<Przejscie>();
		listaDrzwi = new ArrayList<Drzwi>();
		listaZlodziei = new ArrayList<Zlodziej>();
		listaPrzedmiotow = new ArrayList<Przedmiot>();
		listaZadan = new ArrayList<Zadanie>();
		koniecGry = false;
		lapowka = 0;
	}
	
	public void dodajZlodzieja(String nazwa, Komnata komnata){
		Zlodziej z = new Zlodziej(nazwa, komnata);
		listaZlodziei.add(z);
	}
	
	public void dodajKomnate(int nr, String o){
		Komnata k = new Komnata(nr, o, this);
		listaKomnat.add(k);
	}
	
	public void dodajPrzejscie(String n, Komnata k1, Komnata k2){
		Przejscie p = new Przejscie(n, k1, k2);
		listaPrzejsc.add(p);	
	}
	
	public void dodajDrzwi(String n, Komnata k1, Komnata k2){
		Drzwi d = new Drzwi(n, k1, k2);
		listaDrzwi.add(d);	
	}
	
	public void dodajSkarb(String n, Komnata k, int war){
		Przedmiot p = new Skarb(n, k, war);
		listaPrzedmiotow.add(p);
	}
	
	public void dodajKlucz(String n, Komnata k, Drzwi d){
		Przedmiot p = new Klucz(n, k, d);
		listaPrzedmiotow.add(p);
	}
	
	public void dodajZadanie(String n, Komnata k, String p, String o, int war){
		Zadanie z = new Zadanie(n, k, p, o, war);
		listaZadan.add(z);
	}
	
	
	void level1(){

		lapowka = 500;
		
		dodajKomnate(1, "Komnata nr 1");
		dodajKomnate(2, "Komnata nr 2");
		dodajKomnate(3, "Komnata nr 3");
		dodajKomnate(4, "Komnata nr 4");
		dodajKomnate(5, "Komnata nr 5");
		dodajKomnate(6, "Komnata nr 6");
		dodajKomnate(7, "Koniec Labiryntu");
		
		dodajSkarb("perły", listaKomnat.get(0), 150);
		dodajSkarb("pierścień", listaKomnat.get(2), 200);
		dodajSkarb("srebro", listaKomnat.get(3), 150);
		
		dodajDrzwi("drzwi1-3", listaKomnat.get(0), listaKomnat.get(2));
		dodajDrzwi("drzwi2-4", listaKomnat.get(1), listaKomnat.get(3));
		dodajDrzwi("drzwi3-5", listaKomnat.get(2), listaKomnat.get(4));
		dodajDrzwi("drzwi1-6", listaKomnat.get(0), listaKomnat.get(5));
		
		dodajPrzejscie("przejście1-2", listaKomnat.get(0), listaKomnat.get(1));
		dodajPrzejscie("przejście2-3", listaKomnat.get(1), listaKomnat.get(2));
		dodajPrzejscie("przejście3-2", listaKomnat.get(2), listaKomnat.get(1));
		dodajPrzejscie("przejście5-2", listaKomnat.get(4), listaKomnat.get(1));
		dodajPrzejscie("wyjście", listaKomnat.get(4),  listaKomnat.get(6));
		
		dodajKlucz("klucz1-3", listaKomnat.get(1), listaDrzwi.get(0));
		dodajKlucz("klucz2-4", listaKomnat.get(2), listaDrzwi.get(1));
		dodajKlucz("klucz3-5", listaKomnat.get(3), listaDrzwi.get(2));		
		dodajKlucz("klucz1-6", listaKomnat.get(4), listaDrzwi.get(3));
		
		dodajZlodzieja("z1", listaKomnat.get(1));
		
		dodajZadanie("zadanie1", listaKomnat.get(1), "2+2*2/2-2", "2", 150);
		dodajZadanie("zadanie2", listaKomnat.get(3), "Za 4 lata Ola będzie miała dwa razy więcej lat niż miała 2 lata temu. Ile lat ma Ola?","8", 200);
		dodajZadanie("zadanie3", listaKomnat.get(5), "W torebce znajduje się 5 cukierków miętowych i 6 owocowych. Z torebki losujemy 4 cukierki.\n Na ile sposobów można wylosować 2 cukierki miętowe i 2 owocowe?", "150", 250);
		
		gracz = new Gracz("gracz", listaKomnat.get(0));
	}
	
	
	void level2(){

		lapowka = 1000;
		
		dodajKomnate(1, "Komnata nr 1");
		dodajKomnate(2, "Komnata nr 2");
		dodajKomnate(3, "Komnata nr 3");
		dodajKomnate(4, "Komnata nr 4");
		dodajKomnate(5, "Komnata nr 5");
		dodajKomnate(6, "Komnata nr 6");
		dodajKomnate(7, "Komnata nr 7");
		dodajKomnate(8, "Komnata nr 8");
		dodajKomnate(9, "Komnata nr 9");
		dodajKomnate(10, "Komnata nr 10");
		dodajKomnate(11, "Komnata nr 11");
		dodajKomnate(12, "Komnata nr 12");
		dodajKomnate(13, "Komnata nr 13");
		dodajKomnate(14, "Komnata nr 14");
		dodajKomnate(15, "Koniec Labiryntu");
		
		dodajSkarb("złoto", listaKomnat.get(0), 150);
		dodajSkarb("pierścień", listaKomnat.get(2), 70);
		dodajSkarb("srebro", listaKomnat.get(3), 100);
		dodajSkarb("diament", listaKomnat.get(7), 150);
		dodajSkarb("szmaragd", listaKomnat.get(12), 50);
		dodajSkarb("perła", listaKomnat.get(12), 100);
		dodajSkarb("rubin", listaKomnat.get(13), 60);
		dodajSkarb("brylant", listaKomnat.get(9), 130);
		
		
		dodajDrzwi("drzwi1-3", listaKomnat.get(0), listaKomnat.get(2));
		dodajDrzwi("drzwi2-4", listaKomnat.get(1), listaKomnat.get(3));
		dodajDrzwi("drzwi4-7", listaKomnat.get(3), listaKomnat.get(6));
		dodajDrzwi("drzwi5-8", listaKomnat.get(4), listaKomnat.get(7));
		dodajDrzwi("drzwi6-9", listaKomnat.get(5), listaKomnat.get(8));
		dodajDrzwi("drzwi9-11", listaKomnat.get(8), listaKomnat.get(10));
		
		dodajPrzejscie("przejście1-2", listaKomnat.get(0), listaKomnat.get(1));
		dodajPrzejscie("przejście2-1", listaKomnat.get(1), listaKomnat.get(0));
		dodajPrzejscie("przejście2-5", listaKomnat.get(1), listaKomnat.get(4));
		dodajPrzejscie("przejście5-6", listaKomnat.get(4), listaKomnat.get(5));
		dodajPrzejscie("przejście6-7", listaKomnat.get(5), listaKomnat.get(6));
		dodajPrzejscie("przejście7-2", listaKomnat.get(6), listaKomnat.get(1));
		dodajPrzejscie("przejście9-8", listaKomnat.get(8), listaKomnat.get(7));
		dodajPrzejscie("przejście8-10", listaKomnat.get(7), listaKomnat.get(9));
		dodajPrzejscie("przejście10-5", listaKomnat.get(9), listaKomnat.get(4));
		dodajPrzejscie("przejście11-13", listaKomnat.get(10), listaKomnat.get(12));
		dodajPrzejscie("przejście12-2", listaKomnat.get(11), listaKomnat.get(1));
		dodajPrzejscie("przejście13-14", listaKomnat.get(12), listaKomnat.get(13));
		dodajPrzejscie("przejście13-6", listaKomnat.get(12), listaKomnat.get(5));
		dodajPrzejscie("przejście14-11", listaKomnat.get(13), listaKomnat.get(10));
		dodajPrzejscie("wyjście", listaKomnat.get(11),  listaKomnat.get(14));
		
		dodajKlucz("klucz1-3", listaKomnat.get(1), listaDrzwi.get(0));
		dodajKlucz("klucz2-4", listaKomnat.get(2), listaDrzwi.get(1));
		dodajKlucz("klucz4-7", listaKomnat.get(5), listaDrzwi.get(2));
		dodajKlucz("klucz5-8", listaKomnat.get(6), listaDrzwi.get(3));
		dodajKlucz("klucz6-9", listaKomnat.get(7), listaDrzwi.get(4));
		dodajKlucz("klucz9-11", listaKomnat.get(9), listaDrzwi.get(5));
		dodajKlucz("klucz10-12", listaKomnat.get(10), listaDrzwi.get(6));
		
		
		dodajZlodzieja("z1", listaKomnat.get(1));
		dodajZlodzieja("z2", listaKomnat.get(5));
		dodajZlodzieja("z3", listaKomnat.get(12));
		
		dodajZadanie("zadanie1", listaKomnat.get(1), "Dwóm ogrodnikom zabiera 8 dni aby skosić ogródek.\nJeden ogrodnik jest leniwy a jeden energiczny.\nEnergiczny ogrodnik sam skosi łąkę w ciągu 12 dni.\nJak wiele dni będzie trwało koszenie ogródka przez leniwego ogrodnika? Podaj tylko liczbę.", "24", 150);
		dodajZadanie("zadanie2", listaKomnat.get(6), "Oblicz granicę przy x zbiegającym do 0: lim(((1+x)(1+2x)(1+3x)-1)/x)","6", 100);
		dodajZadanie("zadanie3", listaKomnat.get(8), "Średnia arytmetyczna zestawu danych: 3, 8, 3, 11, 3, 10, 3, x  jest równa 6. Podaj medianę tego zestawu", "5", 50);
		dodajZadanie("zadanie4" , listaKomnat.get(13), "W ciągu arytmetycznym (an) pierwszy wyraz jest równy -3, a wyraz 145 jest równy 2157. Podaj różnicę tego ciągu.", "15", 100);
		
		gracz = new Gracz("gracz", listaKomnat.get(0));
	}
	
	void level3(){

		lapowka = 1300;
		
		dodajKomnate(1, "Komnata nr 1");
		dodajKomnate(2, "Komnata nr 2");
		dodajKomnate(3, "Komnata nr 3");
		dodajKomnate(4, "Komnata nr 4");
		dodajKomnate(5, "Komnata nr 5");
		dodajKomnate(6, "Komnata nr 6");
		dodajKomnate(7, "Komnata nr 7");
		dodajKomnate(8, "Komnata nr 8");
		dodajKomnate(9, "Komnata nr 9");
		dodajKomnate(10, "Komnata nr 10");
		dodajKomnate(11, "Komnata nr 11");
		dodajKomnate(12, "Komnata nr 12");
		dodajKomnate(13, "Komnata nr 13");
		dodajKomnate(14, "Komnata nr 14");
		dodajKomnate(15, "Komnata nr 15");
		dodajKomnate(16, "Komnata nr 16");
		dodajKomnate(17, "Koniec labiryntu");
		
		dodajSkarb("PierścieńŻycia", listaKomnat.get(2), 100);
		dodajSkarb("MieczSprawiedliwości", listaKomnat.get(3), 170);
		dodajSkarb("DrogocennyKamień", listaKomnat.get(4), 100);
		dodajSkarb("Diament", listaKomnat.get(5), 120);
		dodajSkarb("ZłotaKorona", listaKomnat.get(7), 150);
		dodajSkarb("MagicznyTalizman", listaKomnat.get(10), 200);
		dodajSkarb("ŁukElficki", listaKomnat.get(15), 500);
		
		dodajDrzwi("drzwi1-2", listaKomnat.get(0), listaKomnat.get(1));
		dodajDrzwi("drzwi1-4", listaKomnat.get(0), listaKomnat.get(3));
		dodajDrzwi("drzwi2-5", listaKomnat.get(1), listaKomnat.get(4));
		dodajDrzwi("drzwi3-6", listaKomnat.get(3), listaKomnat.get(5));
		dodajDrzwi("drzwi7-8", listaKomnat.get(6), listaKomnat.get(7));
		dodajDrzwi("drzwi8-10", listaKomnat.get(7), listaKomnat.get(9));
		dodajDrzwi("drzwi10-13", listaKomnat.get(9), listaKomnat.get(12));
		dodajDrzwi("drzwi13-16", listaKomnat.get(12), listaKomnat.get(15));
		dodajDrzwi("drzwi11-12", listaKomnat.get(10), listaKomnat.get(11));
		dodajDrzwi("drzwi12-14", listaKomnat.get(11), listaKomnat.get(13));
		
		dodajPrzejscie("przejście1-3", listaKomnat.get(0), listaKomnat.get(2));
		dodajPrzejscie("przejście3-1", listaKomnat.get(2), listaKomnat.get(0));
		dodajPrzejscie("przejście4-5", listaKomnat.get(3), listaKomnat.get(4));
		dodajPrzejscie("przejście6-4", listaKomnat.get(5), listaKomnat.get(3));
		dodajPrzejscie("przejście5-7", listaKomnat.get(4), listaKomnat.get(6));
		dodajPrzejscie("przejście6-9", listaKomnat.get(5), listaKomnat.get(8));
		dodajPrzejscie("przejście9-5", listaKomnat.get(8), listaKomnat.get(4));
		dodajPrzejscie("przejście7-1", listaKomnat.get(6), listaKomnat.get(0));
		dodajPrzejscie("przejście7-11", listaKomnat.get(6), listaKomnat.get(10));
		dodajPrzejscie("przejście8-4", listaKomnat.get(7), listaKomnat.get(3));
		dodajPrzejscie("przejście11-5", listaKomnat.get(10), listaKomnat.get(4));
		dodajPrzejscie("przejście12-7", listaKomnat.get(11), listaKomnat.get(6));
		dodajPrzejscie("przejście10-15", listaKomnat.get(9), listaKomnat.get(14));
		dodajPrzejscie("przejście15-8", listaKomnat.get(14), listaKomnat.get(7));
		dodajPrzejscie("przejście16-7", listaKomnat.get(15), listaKomnat.get(6));
		dodajPrzejscie("przejście14-8", listaKomnat.get(13), listaKomnat.get(7));
		dodajPrzejscie("wyjście", listaKomnat.get(13),  listaKomnat.get(16));		
		
		dodajKlucz("klucz1-2", listaKomnat.get(2), listaDrzwi.get(0));
		dodajKlucz("klucz1-4", listaKomnat.get(1), listaDrzwi.get(1));
		dodajKlucz("klucz2-5", listaKomnat.get(3), listaDrzwi.get(2));
		dodajKlucz("klucz3-6", listaKomnat.get(4), listaDrzwi.get(3));
		dodajKlucz("klucz7-8", listaKomnat.get(5), listaDrzwi.get(4));
		dodajKlucz("klucz8-10", listaKomnat.get(8), listaDrzwi.get(5));
		dodajKlucz("klucz10-13", listaKomnat.get(11), listaDrzwi.get(6));
		dodajKlucz("klucz13-16", listaKomnat.get(14), listaDrzwi.get(7));
		dodajKlucz("klucz11-12", listaKomnat.get(9), listaDrzwi.get(8));
		dodajKlucz("klucz12-14", listaKomnat.get(12), listaDrzwi.get(9));
		
		dodajZlodzieja("z1", listaKomnat.get(1));
		dodajZlodzieja("z2", listaKomnat.get(6));
		dodajZlodzieja("z3", listaKomnat.get(8));
		
		dodajZadanie("zadanie1", listaKomnat.get(0), "W pewnej szkole liczącej 500 uczniów 80% uczy się języka angielskiego,\n 49% – języka rosyjskiego,\n a 37% uczy się obu tych języków.\nPodaj liczbę uczniów, którzy nie uczą się żadnego z tych języków.", "40", 250);
		dodajZadanie("zadanie2", listaKomnat.get(6), "W szuﬂadzie jest 40 koszulek, wśród których 10% jest zielonych, a pozostałe są niebieskie.\n Losowo wyciągamy po jednej koszulce i - bez oglądania - odkładamy do pudełka.\n Ile co najmniej koszulek należy wyciągnąć, aby mieć pewność, że w pudełku będą co najmniej trzy koszulki niebieskie?","4", 300);
		dodajZadanie("zadanie3", listaKomnat.get(8), "Z urny, w której jest 6 kul czarnych i 4 żółte, wyjęto dwa razy po jednej kuli ze zwracaniem.\n Oblicz prawdopodobieństwo, że wyjęto kule jednakowych kolorów.\n Jako odpowiedź podaj liczbę %","52", 200);
		dodajZadanie("zadanie4", listaKomnat.get(11), "Oblicz, ile jest liczb naturalnych pięciocyfrowych, w zapisie których nie występuje zero, jest dokładnie jedna cyfra 7 i dokładnie jedna cyfra parzysta.", "5120", 250);
		dodajZadanie("zadanie5" , listaKomnat.get(14), "Po usunięciu jednej liczby z listy danych: 3,2,4,1,5,1,4,1,5,2 średnia arytmetyczna zwiększyła się o 0,2. \nKtórą liczbę usunięto z listy?", "1", 200);
		
		gracz = new Gracz("gracz", listaKomnat.get(0));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Labirynt labirynt = new Labirynt();
		System.out.println("Wybierz wersję labiryntu (wpisz liczbę od 1 do 3).");
		@SuppressWarnings("resource")
		Scanner odczyt = new Scanner(System.in);
		int wersja = odczyt.nextInt();
		if(wersja == 1)
			labirynt.level1();			
		if(wersja == 2)
			labirynt.level2();
		if(wersja == 3)
			labirynt.level3();
		if(wersja > 3)
			System.out.println("Nie ma takiej wersji. Wybierz liczbę od 1 do 3.");

		Polecenie rozkazy[]={new RozejrzyjSie(), new Sprawdz(), new Otworz(), new Zamknij(), new Wez(), new Odloz(), new Przejdz(), new Rozwiaz(), new Majatek(), new WypiszCoMam()};
		Gra gra = new Gra(labirynt, rozkazy);
		gra.graj();

	}

}
