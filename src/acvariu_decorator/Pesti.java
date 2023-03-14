package acvariu_decorator;

public class Pesti extends AcvariuDecor{
	public Pesti(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Pesti();
	}
	/**
	 * 
	 * @return mesaj "Peste adaugat", urmat de o noua linie
	 */
	private String adauga_Pesti() {
		return "Peste adaugat \n";
	}
}
