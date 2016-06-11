import java.util.Scanner;


public class Zadanie {
	String nazwa;
	Komnata komnata;
	String pytanie;
	String odpowiedz;
	int wartosc;
	boolean czyRozwiazane;
	
	public Zadanie(String n, Komnata k, String p, String o, int war){
		nazwa = n;
		komnata = k;
		pytanie = p;
		odpowiedz = o;
		wartosc = war;
		czyRozwiazane = false;
	}
	
	public void rozwiazanie(){
		if(czyRozwiazane == true){
			System.out.println("To zadanie już zostało zrobione ! Nie możesz go robić drugi raz !");
			return;
		}
		
		System.out.println(pytanie);
		System.out.println("Odpowiedź:");
		@SuppressWarnings("resource")
		Scanner czytaj = new Scanner(System.in);
		String odpgracza = czytaj.nextLine();
		if(odpgracza.equals(odpowiedz)){
			System.out.println("Odpowiedziałeś prawidłowo, otrzymujesz w nagrodę skarb o wartości " + wartosc + ".");
			komnata.labirynt.gracz.majatek += wartosc;
			czyRozwiazane = true;
		}
		else
			System.out.println("Zła odpowiedź.");
	}
}
