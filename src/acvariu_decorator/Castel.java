package acvariu_decorator;

public class Castel extends AcvariuDecor {
	public Castel(Acvariu acv) {
		super(acv);
	}

	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu() + adauga_Castel();
	}

	private String adauga_Castel() {
		return "Castel adaugat \n";
	}
}
