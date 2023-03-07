package acvariu_decorator;

public class Fish_food extends AcvariuDecor{
	public Fish_food(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Fishfood();
	}
	private String adauga_Fishfood() {
		return "Mancare de peste adaugata \n";
	}
}
