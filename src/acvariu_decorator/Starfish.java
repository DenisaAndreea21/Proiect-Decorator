package acvariu_decorator;

public class Starfish extends AcvariuDecor{
	public Starfish(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Starfish();
	}
	private String adauga_Starfish() {
		return "Steluta de mare adaugata \n";
	}
}
