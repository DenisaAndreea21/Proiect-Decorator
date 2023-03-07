package acvariu_decorator;

public class Alge extends AcvariuDecor{
	public Alge(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Alge();
	}
	private String adauga_Alge() {
		return "Alge adaugate \n";
	}
}
