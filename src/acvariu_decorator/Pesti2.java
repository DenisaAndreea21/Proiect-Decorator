package acvariu_decorator;

public class Pesti2 extends AcvariuDecor{
	public Pesti2(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Pesti2();
	}
	private String adauga_Pesti2() {
		return "Peste adaugat \n";
	}
}
