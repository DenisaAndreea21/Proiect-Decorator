package acvariu_decorator;

public class Goldfish extends AcvariuDecor{
	public Goldfish(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Goldfish();
	}
	private String adauga_Goldfish() {
		return "Pestisor auriu adaugat \n";
	}
}
