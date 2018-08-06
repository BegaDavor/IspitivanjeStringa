import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Metode metode = new Metode();
		
		System.out.println("Unesite neki string: ");
		
		String recenica = input.nextLine();
		
		System.out.println("Duzina stringa je: " + metode.duzina(recenica));
		System.out.print("Karakteri na neparnim pozicijama su: ");
		metode.karakteriNaNeparnimPozicijama(recenica);
		System.out.print("\nKarakteri na parnim pozicijama su: ");
		metode.karakteriNaParnimPozicijama(recenica);
		System.out.println("Broj uppercase karaktera je: " + metode.uppercaseKarakteri(recenica));
		System.out.println("Broje lowercase karaktera je: " + metode.lowercaseKarakteri(recenica));
		System.out.print("\nKarakteri koji nisu slova su: ");
		metode.karakteriKojiNisuSlova(recenica);
		
		input.close();
	}

}
