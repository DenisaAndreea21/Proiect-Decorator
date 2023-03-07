package acvariu_decorator;

public class Coral extends AcvariuDecor {
	public Coral(Acvariu acv) {
		super(acv);
	}

	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu() + adauga_Coral();
	}

	private String adauga_Coral() {
		return "Coral adaugat \n";
	}
}
