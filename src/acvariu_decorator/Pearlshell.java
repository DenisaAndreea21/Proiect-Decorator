package acvariu_decorator;

public class Pearlshell extends AcvariuDecor{
	public Pearlshell(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Pearlshell();
	}
	private String adauga_Pearlshell() {
		return "Scoica cu perla adaugata \n";
	}
}
