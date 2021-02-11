package task01;

public class Task01DaliborJelicanin {

	// kreirati klasu zaposleni sa atributima ime, palta, sef klase Sef.
	// Klasa ima:
	// konstruktor koji ima 2 argumenta kojima se postavljaju vrednosti za ime i platu.
	// Metodu postaviPlatu 
	// Metodu postaviSefa
	// metodu prikazi kojima se prikazuju podaci o osobi ime, plata, pseudonim sefa
	
	// Kreirati klasu Sef sa atributima: pseudonim, odeljenje, starost
	// klasa ima konstruktor sa jednim argumentom kojim se postavlja pseudonim
	// metoda povecajPlatu koja promeni platu zaposlenom, ali samo ako je on sef zaposlenom i ako je plata poz broj
	// metodu prikazi koja prikazuje podatke o sefu
	
	// napisati glavni program.
	// kreirati 3 zaposlena i 2 sefa sa razlicitim pseudonima
	// platu svima postaviti na 521
	// dodeliti 1. zaposlenom 1.sefa, 2. zaposlenom 2.sefa
	// prikazati podatke o svim zaposlenima
	
	// 1.sef pokusava svim zaposlenima da promeni platu za 100
	// prikazati podatke o svim zaposlenima
	
	// 2.sef pokusava da smanji paltu svom zaposlenom za 100
	// ispisati podatke o tom zaposlenom
	
	//Direktno smanjiti platu svim zaposelnima za 100
	// ispisati podatke o svim zaposlenima
	
	
	public static void main(String[] args) {
		
		Zaposleni zaposleni1 = new Zaposleni("zaposleni 1", 521);
		Zaposleni zaposleni2 = new Zaposleni("zaposleni 2", 521);
		Zaposleni zaposleni3 = new Zaposleni("zaposleni 3", 521);
		
		Sef sef1 = new Sef("sef1");
		Sef sef2 = new Sef("sef2");
		
		zaposleni1.setSef(sef1);
		zaposleni2.setSef(sef2);
		
		System.out.println(zaposleni1);
		System.out.println(zaposleni2);
		System.out.println(zaposleni3);
		
		sef1.povecajPlatu(zaposleni1, 100);
		sef1.povecajPlatu(zaposleni2, 100);
	}

}

















