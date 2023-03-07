package acvariu_decorator;

public class Pesti1 extends AcvariuDecor{
	public Pesti1(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Pesti1();
	}
	private String adauga_Pesti1() {
		return "Peste adaugat \n";
	}
}