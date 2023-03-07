package acvariu_decorator;

public class Scoici extends AcvariuDecor{
	public Scoici(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Scoici();
	}
	private String adauga_Scoici() {
		return "Scoica adaugata \n";
	}
}
