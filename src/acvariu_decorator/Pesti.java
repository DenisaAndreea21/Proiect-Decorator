package acvariu_decorator;

public class Pesti extends AcvariuDecor{
	public Pesti(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Pesti();
	}
	private String adauga_Pesti() {
		return "Peste adaugat \n";
	}
}
