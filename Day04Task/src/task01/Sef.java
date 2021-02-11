package task01;

public class Sef {

	String pseudonim;
	String odeljenje;
	int starost;
	
	public Sef(String pseudonim) {
		this.pseudonim = pseudonim;
	}

	public String getPseudonim() {
		return pseudonim;
	}

	public void povecajPlatu(Zaposleni zaposleni, double plata) {
		if (zaposleni.getSef() == this && plata > 0) {
			zaposleni.setPlata(zaposleni.getPlata() + plata);
		}
	}

	@Override
	public String toString() {
		return "Sef [pseudonim=" + pseudonim + ", odeljenje=" + odeljenje + ", starost=" + starost + "]";
	}
}
