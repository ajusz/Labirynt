import java.util.Scanner;

public class Gra {
	Labirynt labirynt;
	Polecenie rozkazy[];
	
	public Gra(Labirynt l, Polecenie r[]){
		labirynt = l;
		rozkazy = r;
	}
	public void graj(){
		System.out.println("Jesteś uwięziony w podziemnym labiryncie.");
		System.out.println("Twoim celem jest się z niego wydostać. Jednak nie będzie to takie proste, bo przy wyjściu znajduje się strażnik.");
		System.out.println("Aby wyjść z labiryntu musisz zebrać odpowiednio duży majątek i przekupić strażnika.");
		System.out.println("Labirynt składa się z komnat połączonych jednostronnymi przejściami oraz dwustronnymi drzwiami (do których otwarcia potrzebne są klucze).");
		System.out.println("W komnatach znajdują się skarby o określonych wartościach, \nklucze do różnych drzwi oraz zadania do rozwiązania (poprawne rozwiązanie zadania zwiększa Twój majątek).");
		System.out.println("Po labiryncie popruszają się również złodzieje, więc musisz uważać!\n");
		System.out.println("Instrukcje, których możesz używać (słowa napisane wielkimi literami trzeba zastępować odpowiednimi nazwami):");
		System.out.println("rozejrzyj się - podaje szczegółowy opis komnaty, w której się znajdujesz");
		System.out.println("sprawdź PRZEDMIOT - podaje opis danego przedmiotu");
		System.out.println("otwórz DRZWI");
		System.out.println("zamknij DRZWI");
		System.out.println("przejdź PRZEJŚCIE/DRZWI");
		System.out.println("weź PRZEDMIOT");
		System.out.println("odłóż PRZEDMIOT");
		System.out.println("majątek - podaje aktualny stan Twojego majątku (jego wartość)");
		System.out.println("wypisz co mam - wypisuje wszystkie przedmioty, które należą do gracza");
		System.out.println("rozwiąż ZADANIE\n");
		System.out.println("Do przekupienia strażnika potrzebujesz majątku o wartości " + labirynt.lapowka + "\n");
		@SuppressWarnings("resource")
		Scanner odczyt = new Scanner(System.in);
		String tekst;
		while(odczyt.hasNext())
		{
			tekst = odczyt.nextLine();
			String wynik[] = null;
			wynik = tekst.split(" ");
			int i;
			for(i=0; i < rozkazy.length; i++){
				if(rozkazy[i].nazwa().equals(wynik[0])){
					rozkazy[i].wykonaj(labirynt, wynik);
					break;
				}
			}
			if(i == rozkazy.length){
				System.out.println("Niepoprawna instrukcja.");
			}
			if(labirynt.koniecGry)
				break;
		}
		System.out.println("Koniec gry.");	
	}
}
