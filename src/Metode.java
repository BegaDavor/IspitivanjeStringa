
public class Metode {
	
	//Atributi
	
	public String recenica;
	
	//Ponasanje
	
	public int duzina(String recenica) {
		int duzina = recenica.length();
		
		return duzina;
	}
	
	public void karakteriNaNeparnimPozicijama(String recenica) {
		System.out.print("Karakteri na neparnim pozicijama su: ");
		for (int i = 0; i < recenica.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(recenica.charAt(i) + " ");
			}
		}
	}
	
	public void karakteriNaParnimPozicijama(String recenica) {
		System.out.print("Karakteri na parnim pozicijama su: ");
		for (int i = 0; i < recenica.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(recenica.charAt(i) + " ");
			}
		}
	}
	
	public int uppercaseKarakteri(String recenica) {
		//Iplementirati metodu koja vraca broj uppercase karaktera
	}
	
	public int lowercaseKarakteri(String recenica) {
		//Implementirati metodu koja vraca broj lowercase karaktera
	}
	
	public void karakteriKojiNisuSlova(String recenica) {
		//Implementirati metodu koja vraca sve karaktere koji nisu slova
	}

}
