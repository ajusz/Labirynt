import java.util.Scanner;

public class Hello{
  public static void main(String[] args){
      String imie; //w nim zapiszemy swoje imie
      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
 
      imie = odczyt.nextLine();
 
      System.out.println("Witaj "+imie); //wyświetlamy powitanie
  }
}