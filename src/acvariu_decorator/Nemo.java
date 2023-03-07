package acvariu_decorator;

public class Nemo extends AcvariuDecor{
	public Nemo(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Nemo();
	}
	private String adauga_Nemo() {
		return "Pestisor Nemo adaugat \n";
	}
}