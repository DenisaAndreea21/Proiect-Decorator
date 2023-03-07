package acvariu_decorator;

public class Scoici1 extends AcvariuDecor{
	public Scoici1(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Scoici1();
	}
	private String adauga_Scoici1() {
		return "Scoica1 adaugata \n";
	}
}
