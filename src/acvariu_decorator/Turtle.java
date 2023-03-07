package acvariu_decorator;

public class Turtle extends AcvariuDecor{
	public Turtle(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Turtle();
	}
	private String adauga_Turtle() {
		return "Broasca testoasa adaugata \n";
	}
}
